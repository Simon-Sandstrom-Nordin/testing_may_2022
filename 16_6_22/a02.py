import matplotlib.pyplot as plt
import math

# x = [1, 2]
# y = [2, 4]

# plt.plot(x, y, 'bo')
# plt.show()


# Binomial distribution
def binomial(n, k, p):
    combinations = math.factorial(n) / (math.factorial(k)*math.factorial(n-k))
    probability = combinations * (p ** k) * ((1 - p) ** (n - k))
    return probability


n = 20
p = 1/6

x = []
px = []

for i in range(n):
    x.append(i)
    px.append(binomial(n, i, p))


plt.plot(x, px, 'o')
plt.show()
