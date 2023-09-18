
class CoffeSingleton:
    _instance = None

    def __init__(self):
        if not CoffeSingleton._instance:
            print(" __init__ method called..")
        else:
            print("Instance already created:", self.get_instance())

    @classmethod
    def get_instance(cls):
        if not cls._instance:
            cls._instance = CoffeSingleton()
        return cls._instance
    

if __name__ == '__main__':
    s1 = CoffeSingleton()
    print("Object created", CoffeSingleton.get_instance())
    s2 = CoffeSingleton()

    print("Object created", CoffeSingleton.get_instance())
