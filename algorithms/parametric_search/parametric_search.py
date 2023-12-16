import sys
input = sys.stdin.readline

n = int(input())
data = [802, 743, 457, 539]

left, right = 1, max(data)  
result = 0
while left <= right:
    mid = (left + right) // 2
    total = 0
    for i in data:
        total += i // mid

    if total >= n:
        left = mid + 1
        result = mid
    else:
        right = mid - 1

print(result)