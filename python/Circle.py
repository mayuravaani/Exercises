"""
Problem:
Write a python program to print the area and perimeter of a circle

"""
import math

radius = float(input("Enter the radius of the circle: "))

area = math.pi * radius ** 2
print("Area of the circle is:", area)

perimeter = 2 * math.pi * radius
print("Perimeter (circumference) of the circle is:", perimeter)
