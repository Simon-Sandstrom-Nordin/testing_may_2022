% Homotopic deformation
clear, clc;

h_1 = @(t,s) (1-s).*exp(2*pi*1i.*t) + 3*s*(1+8*1i.*t);
h_2 = @(t,s) (1-s).*exp(2*pi*1i.*t) + 3*s*(2-8.*t+1i);
h_3 = @(t,s) (1-s).*exp(2*pi*1i.*t) + 3*s*(-1+4*1i*(1-2.*t));
h_4 = @(t,s) (1-s).*exp(2*pi*1i.*t) + 3*s*(8.*t-6-1i);
h_5 = @(t,s) (1-s).*exp(2*pi*1i.*t) + 3*s*(1+8*1i*(t-1));

s = 0;
%s = linspace(0,1);

for k = 1:1:11

t_1 = linspace(0, 1/8);
t_2 = linspace(1/8, 3/8);
t_3 = linspace(3/8, 5/8);
t_4 = linspace(5/8, 7/8);
t_5 = linspace(7/8, 1);

h = [h_1(t_1, s), h_2(t_2, s), h_3(t_3, s), h_4(t_4, s), h_5(t_5, s)];
figure(k);
plot(real(h), imag(h)); axis([-3 3 -3 3]);

s = s + .1

end
