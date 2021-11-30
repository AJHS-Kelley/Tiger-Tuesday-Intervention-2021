# Grade Calculator Practice, 11/16/21 

print("This program will take a numerical grade between 0 and 100 and print the letter grade.\n")

grade = float(input("Please enter the numerical grade including the decimal.\n"))
print(grade)

if grade >= 89.5: 
    print("That grade is an A.\n")
elif grade >= 79.5:
    print("That grade is a B.\n")
elif grade >= 69.5: 
    print("That grade is a C.\n")
elif grade >= 59.5: 
    print("That grade is a D.\n")
else: 
    print("That grade is an F.\n")