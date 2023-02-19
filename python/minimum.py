"""
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

"""

x = int(input("Enter the charges of first cab service: "))
y = int(input("Enter the charges of second cab service: "))

if x < y:
    print("Take the first cab service")
elif y < x:
    print("Take the second cab service")
else:
    print("Either cab service is fine")
