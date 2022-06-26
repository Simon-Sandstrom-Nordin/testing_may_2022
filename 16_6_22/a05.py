import math as m
#import sympy as s


i = 11
while True:
    if m.gcd(i, 2) == m.gcd(i, 3) == m.gcd(i, 4) == m.gcd(i, 5) == m.gcd(i, 6) == m.gcd(i, 7) == m.gcd(i, 8) == m.gcd(i, 9) == m.gcd(i, 10) == 1:
        if s.isprime(i) is False:
            break
    i += 1

print(i)

import math as m
list = []
for k in range(10, 100):
    if m.gcd(k, 23) != 1 or m.gcd(k, 17) != 1:
        list.append(k)

print(list)
