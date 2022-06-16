package main

import (
	"fmt"
)

func main() {
	var a = .1
	var b = .2
	var a_b = .05

	fmt.Println(pie(a, b, a_b))
}

func pie(a float64, b float64, a_b float64) float64 {
	answer := a + b - a_b //:= automatically assigns type declaration and data type.
	return answer
}
