package main

import (
	"fmt"
	"math"
)

func main() {
	var a = .1
	var b = .2
	var a_b = .05

	fmt.Println(pie(a, b, a_b))

	black := 4
	white := 3

	fmt.Println(with(float64(black), float64(white)))
	//fmt.Println(sin(float64(black), float64(white)))
}

func pie(a float64, b float64, a_b float64) float64 {
	answer := a + b - a_b //:= automatically assigns type declaration and data type.
	return answer
}

func with(b float64, w float64) float64 {
	comb_int := factorial(2) / (factorial(1) * factorial(1))
	var comb float64 = float64(comb_int)
	return comb * w * b / math.Pow(w+b, 2)
}

func factorial(n int) int {
	if n <= 1 { // "base case"
		return 1
	}

	return n * factorial(n-1) // recursive call {"case"}

}
