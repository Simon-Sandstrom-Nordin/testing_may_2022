function hyper = hyper(v, s, k, n)
    hyper = nchoosek(v, k).*nchoosek(s, n-k)./nchoosek(v+s, n);
end
