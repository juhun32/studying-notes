def binary_search(target, data):
    data.sort()
    start = 0
    end = len(data) - 1

    while start <= end:
        mid = (start + end) // 2

        if data[mid] == target:
            return mid
        
        elif data[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    # return None


if __name__ == "__main__":
    lis = [30, 94, 27, 92, 21, 37, 25, 47, 25, 53, 98, 19, 32, 32, 7]
    target = 25
    print(binary_search(target, lis))