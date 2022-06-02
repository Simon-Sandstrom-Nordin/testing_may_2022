package main

// graph poisson distribution

import (
	"fmt"
	"math"
)

func main() {

	for k := 0; k <= 7; k++ {
		fmt.Println(Poisson(0.5, k))
	}
}

func Factorial(n int) int {
	if n <= 1 {
		return 1
	}

	return n * Factorial(n-1)
}

func Power(b float64, e int) float64 {
	var res float64
	res = 1
	for i := 0; i < e; e++ {
		res = res * b
	}
	return res
}

func Poisson(m float64, k int) float64 {
	var ans float64
	ans = Power(m, k) / float64(Factorial(k)) * math.Exp(-m)
	return ans
}
