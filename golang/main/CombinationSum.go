package main

import "fmt"

func combinationSum(candidates []int, target int) [][]int {

	var a = [][]int{
		{0, 1, 2, 3},
		{4, 5, 6, 7},
		{8, 9, 10, 11},
	}
	return a
}

func main() {
	fmt.Print(combinationSum([]int{2, 3, 6, 7}, 7))
	fmt.Print("\n")
	fmt.Print(combinationSum([]int{2, 3, 5}, 8))
}
