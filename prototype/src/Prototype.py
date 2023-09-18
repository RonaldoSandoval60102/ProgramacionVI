import copy

class Shape:
    def __init__(self):
        self.type = None

    def clone(self):
        return copy.copy(self)
    
    def getType(self):
        return self.type
    
    def draw(self):
        print("Drawing a shape")
        
class Rectangle(Shape):
    def __init__(self):
        self.type = "Rectangle"
        
    def draw(self):
        print("Drawing a rectangle")
        
        
class Circle(Shape):
    def __init__(self):
        self.type = "Circle"
        
    def draw(self):
        print("Drawing a circle")
        
        

original = Rectangle()
print(original.getType())
original.draw()

clone = original.clone()
print(clone.getType())
clone.draw()

if original is clone:
    print("Original and clone are the same object")
else:
    print("Original and clone are different objects")