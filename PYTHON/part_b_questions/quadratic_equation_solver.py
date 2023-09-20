import math

a = float(input("Enter value of a: "))
b = float(input("Enter value of b: "))
c = float(input("Enter value of c: "))

disc = b**2 - (4*a*c)

if disc > 0:
    r1 = (-b + math.sqrt(disc)) / (2*a)
    r2 = (-b - math.sqrt(disc)) / (2*a)
    print(f"Real and distinct roots\n root1: {r1} root 2: {r2}")
elif disc == 0:
    r = -b / (2*a)
    print(f"Roots are equal\n root: {r}")
else:
    real = -b / (2*a)
    img = math.sqrt(abs(disc))/(2*a)
    print(f"Roots are imaginary\n root1: {real} + i{img} root2: {real} - i{img}")


