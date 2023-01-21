#Problem:
#Write a python program to print the area and perimeter of a circle

import math

radius = input("Please enter the radius of the circle : ")
PI = 3.14

area = PI * math.pow(float(radius), 2)
perimeter = 2 * PI * float(radius)

print("Area :", area , "and the Perimeter :", perimeter)

