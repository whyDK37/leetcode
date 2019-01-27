package main

import "fmt"

func searchRange(nums []int, target int) []int {
	/* 声明局部变量 */
	var first = -1
	var second = -1

	// find the small index
	var start = 0
	var end = len(nums) - 1
	for {
		if start > end {
			break
		}

		var mid = (end-start)/2 + start
		if nums[mid] > target {
			end = mid - 1
		} else if nums[mid] < target {
			start = mid + 1
		} else {
			if nums[mid] == target && mid == 0 {
				first = 0
				break
			} else if nums[mid-1] == target {
				end = end - 1
			} else if nums[mid] == target {
				first = mid
				break
			} else {
				first = -1
				break
			}
		}
	}

	// find the big index
	start = 0
	end = len(nums) - 1
	for {
		if start > end {
			break
		}

		var mid = (end-start)/2 + start
		if nums[mid] > target {
			end = mid - 1
		} else if nums[mid] < target {
			start = mid + 1
		} else {
			if nums[mid] == target && mid == len(nums)-1 {
				second = len(nums) - 1
				break
			} else if nums[mid+1] == target {
				start = start + 1
			} else if nums[mid] == target {
				second = mid
				break
			} else {
				second = -1
				break
			}
		}
	}

	return []int{first, second}

}

func main() {
	//var n [10]int /* n 是一个长度为 10 的数组 */
	///* 为数组 n 初始化元素 */
	var i int
	j := 2
	//for i = 0; i < 10; i++ {
	//	n[i] = i + 100 /* 设置元素为 i + 100 */
	//}
	fmt.Printf("print %d:\n", i)
	fmt.Printf("print %d:\n", j)

	var result = searchRange([]int{5, 7, 7, 8, 8, 10}, 8)
	fmt.Print(result) // 3,4
	fmt.Print("\n")   // 3,4
	result = searchRange([]int{5, 7, 7, 8, 8, 10}, 6)
	fmt.Print(result) // -1,-1
	fmt.Print("\n")   // 3,4
	result = searchRange([]int{5, 7, 7, 8, 8, 10}, 5)
	fmt.Print(result) // -1,-1
	fmt.Print("\n")   // 3,4
	result = searchRange([]int{5, 7, 7, 8, 8, 10}, 7)
	fmt.Print(result) // -1,-1
	fmt.Print("\n")   // 3,4
	result = searchRange([]int{5, 7, 7, 8, 8, 10}, 10)
	fmt.Print(result) // -1,-1
}
