% Multivariate stochastic variables
close; clear; clc;

A = [.11 .09 .07 .01;
    .07 .12 .12 .02;
    .02 .05 .17 .05;
    .00 .02 .04 .02
    .00 .00 .01 .01];

sum(sum(A));

xexp = @(x, L) 1 - exp(-L*x);
yexp = @(y, L) 1 - exp(-L*y);

% cumilative distribution function, x ∈ Exp(L)
x = (1:.1:3);
x = xexp(x, 1);
% figure(1); plot(x)

% cumilative distribution function, y ∈ Exp(L)
y = (1:.1:3);
y = yexp(y, 2);
% figure(2); plot(y)

A = zeros(length(x), length(y));

for j = 1:1:length(x)
    for k  = 1:1:length(y)
        A(j, k) = x(j)*y(k);
    end
end

mesh(A);

v = diag(A);
plot(v, 'o')

zexp = @(z) 1 - exp(-1.*z) - exp(-2.*z) + exp(-3.*z);
w = zexp((1:.1:3))';
figure(5); plot(w, 'o')

% v == w    % check equality of my two vectors.
