# Pies and dice
def pie(a, b, a_b):   # Priciple of Inclusion and Exclusion, sållprincipen
    return a + b - a_b


a = .1
b = .2
a_b = .05

print(pie(a, b, a_b))


# Draws and yaws
import math


def with_removal(b, w):
    combinations = math.factorial(2) / (math.factorial(1)*math.factorial(1))
    # chance of one of each
    return combinations*b*w / (b+w)**2


def sin_removal(b, w):
    white_combinations = math.factorial(w) / (math.factorial(1) * math.factorial(w-1))
    black_combinations = math.factorial(b) / (math.factorial(1) * math.factorial(b-1))
    all_combinations = math.factorial(w+b) / (math.factorial(2) * math.factorial(b+w-2))
    return white_combinations*black_combinations/all_combinations


b = 4   # black balls
w = 3   # white balls

print("with", with_removal(b, w))
print("sin", sin_removal(b, w))
