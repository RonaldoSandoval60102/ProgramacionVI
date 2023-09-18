# Component 
class Coffee:
    def get_cost(self):
        pass

    def get_description(self):
        pass

# concrete component
class SimpleCoffee(Coffee):
    def get_cost(self):
        return 2.0

    def get_description(self):
        return "Café"

# Decorator
class CoffeeDecorator(Coffee):
    def __init__(self, coffee):
        self._decorated_coffee = coffee

    def get_cost(self):
        return self._decorated_coffee.get_cost()

    def get_description(self):
        return self._decorated_coffee.get_description()

# concrete decorator
class MilkDecorator(CoffeeDecorator):
    def __init__(self, coffee):
        super().__init__(coffee)

    def get_cost(self):
        return super().get_cost() + 0.5

    def get_description(self):
        return super().get_description() + ", Leche"

# client
if __name__ == "__main__":
    coffee = SimpleCoffee()
    print(f"Costo: {coffee.get_cost()}, Descripción: {coffee.get_description()}")

    milk_coffee = MilkDecorator(coffee)
    print(f"Costo: {milk_coffee.get_cost()}, Descripción: {milk_coffee.get_description()}")
