% Hypergeometric distribution
clear; close; clc;

v = 10;
s = 40;
n = 18;

hyp = zeros(1, v)';

for k = 1:v
    hyp(k) = hyper(v,s,k,n);
end

plot((1:v), hyp, 'ro');
xlabel("numner of white balls drawn")
ylabel("probability")
title("?");
legend("white balls = " + v + ". black balls = " + s + ". balls drawn = " + n);
