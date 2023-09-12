import math


class Shape:
    def __init__(self, name):
        self.name = name

    def area(self):
        pass


class Triangle(Shape):
    def __init__(self, base, height):
        super().__init__("Triangle")
        self.base = base
        self.height = height

    def area(self):
        return 0.5 * self.base * self.height


class Circle(Shape):
    def __init__(self, radius):
        super().__init__("Circle")
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2


class Rectangle(Shape):
    def __init__(self, length, width):
        super().__init__("Rectangle")
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width


triangle = Triangle(5, 4)
circle = Circle(3)
rectangle = Rectangle(6, 7)

print(f"Area of {triangle.name} is {triangle.area()}")
print(f"Area of {circle.name} is {circle.area()}")
print(f"Area of {rectangle.name} is {rectangle.area()}")
