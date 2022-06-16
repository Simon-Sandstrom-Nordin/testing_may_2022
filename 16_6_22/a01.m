% Pies sin dice
clear; clc;

pie = @(a, b, a_b) a + b - a_b;

a = .1;
b = .2;
a_b = .05;

disp(pie(a, b, a_b))

% white and black
with_rem = @(b, w) factorial(w) / (factorial(1)*factorial(w-1)) * ...
    factorial(b) / (factorial(1)*factorial(b-1)) / ...
    (factorial(w+b) / (factorial(2)*factorial(w+b-2)));
sin_rem = @(b, w) factorial(2) / (factorial(1)*factorial(1)) * ...
    w*b / (w+b)^2;


b = 4;
w = 3;

disp("with " + with_rem(b, w))
disp("sin " + sin_rem(b, w))
