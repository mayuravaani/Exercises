# Problem:
# Write a python program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

# input numbers
num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

sum = float(num1) + float(num2) # Add two numbers
subt = float(num1) - float(num2) # Subtract two numbers
mult = float(num1) * float(num2) # Multiply two numbers
div = float(num1) / float(num2) # Divide two numbers
reminder = float(num1) % float(num2) # Reminder of two numbers

# Answers
print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))
print('The subtract of {0} and {1} is {2}'.format(num1, num2, subt))
print('The multiply of {0} and {1} is {2}'.format(num1, num2, mult))
print('The divide of {0} and {1} is {2}'.format(num1, num2, div))
print('The reminder of {0} and {1} is {2}'.format(num1, num2, reminder))

