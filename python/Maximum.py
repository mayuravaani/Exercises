"""
Problem:
You are given N integers length array by the user. Find the maximum number

"""
n = int(input())
nums = list(map(int, input().split()))

max_num = nums[0]

for i in range(1, n):
    if nums[i] > max_num:
        max_num = nums[i]

print("Maximum number is:", max_num)
