"""
Problem:
You are given N integers between 1 and 50. Find the count of numbers divisible by K.

Input Format
The input begins with two positive integers N, K. The next N lines contains one positive integer numbers

Output Format
Output a single number denoting how many integers are divisible by K.

"""
n, k = map(int, input().split())
count = 0

for i in range(n):
    num = int(input())
    if num % k == 0:
        count += 1

print(count)
