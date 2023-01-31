/*
Problem:
Write a python program to print the area and perimeter of a circle

*/


import math

r = int(input("Enter the radius: "))

area = math.pi * r * r
perimeter = 2 * math.pi * r


print("area: ",area,"\nperimeter: ",perimeter)