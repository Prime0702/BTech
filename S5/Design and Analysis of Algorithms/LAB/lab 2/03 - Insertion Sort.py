def insertionSort(arr:list) -> list:
    for i in range(1,len(arr)):
        key = arr[i]
        j = i-1
        while j>=0 and arr[j]>key:
            arr[j+1]=arr[j]
            j-=1
        arr[j+1]=key
    return arr

def insertionSortBestCase(arr:list) -> list:
    flag = True
    for i in range(1,len(arr)):
        flag = False
        key = arr[i]
        j = i-1
        while j>=0 and arr[j]>key:
            arr[j+1]=arr[j]
            j-=1
            flag = True
        arr[j+1]=key
        if flag == False:
            break
    return arr