def radixSortStrings(array):
    n = len(array)
    max_len = len(max(array, key=len))
    for i in range(n):
        array[i] = " "* (max_len - len(array[i])) + array[i]
    for i in range(max_len-1,-1,-1):
        count = [0]*256
        output = [""]*n
        for j in range(n):
            count[ord(array[j][i])]+=1
        for j in range(1,256):
            count[j]+=count[j-1]
        for j in range(n-1,-1,-1):
            output[count[ord(array[j][i])]-1] = array[j]
            count[ord(array[j][i])]-=1
        for j in range(n):
            array[j] = output[j]
    for i in range(n):
        array[i] = array[i].strip()
    return array


print(radixSortStrings(["abc", "ab", "a", "abcd", "abcde", "abc", "ab", "a", "abcd", "abcde"]))

