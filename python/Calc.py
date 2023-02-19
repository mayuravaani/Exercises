"""
Problem:
Write a python program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

"""

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Addition
print("addition of", num1, "and", num2, "is", num1 + num2)

# Multiplication
print("multiply of", num1, "and", num2, "is", num1 * num2)

# Subtraction
print("subtraction between", num1, "and", num2, "is", num1 - num2)

# Division
if num2 != 0:
    print("Result of dividing", num1, "by", num2, "is", num1 / num2)
else:
    print("Cannot divide by zero")

# Remainder
if num2 != 0:
    print("Remainder when", num1, "is divided by", num2, "is", num1 % num2)
else:
    print("Cannot calculate remainder when divided by zero")
