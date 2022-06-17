% binomial distribution
close; clear; clc;

binomial = @(n, k, p) factorial(n)./(factorial(k).*factorial(n-k)) .* ...
    p.^(k).*(1-p).^(n-k);


x = (1: 1: 20);
px = binomial(20, x, 1/6);

plot(x, px, 'ro')
