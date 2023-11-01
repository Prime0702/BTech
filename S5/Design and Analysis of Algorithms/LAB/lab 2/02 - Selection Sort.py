def selectionSort(arr:list)->list:
    for i in range(len(arr)):
        min = i
        for j in range(i+1,len(arr)):
            if arr[min]>arr[j]:
                min = j
        arr[i],arr[min]=arr[min],arr[i]
    return arr

def selectionSortBestCase(arr:list)->list:
    flag = True
    for i in range(len(arr)):
        flag = False
        min = i
        for j in range(i+1,len(arr)):
            if arr[min]>arr[j]:
                min = j
                flag = True
        arr[i],arr[min]=arr[min],arr[i]
        if flag == False:
            break
    return arr
