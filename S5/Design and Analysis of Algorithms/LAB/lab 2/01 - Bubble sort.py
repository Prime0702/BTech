def bubbleSort(arr:list) -> list:
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
    return arr

def bubbleSortBestCase(arr:list) -> list:
    flag = True
    for i in range(len(arr)):
        flag = False
        for j in range(len(arr)-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
                flag = True
        if flag == False:
            break
    return arr

