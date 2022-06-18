class Moron:

    def __init__(self, name, age, idiocy):
        self.name = name
        self.age = age
        self.idiocy = idiocy

    def say_hi(self):
        return "Hello, I'm " + self.name


Simon = Moron("Simon", 21, "discord")
print(Simon.say_hi())
