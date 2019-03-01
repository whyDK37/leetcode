package main

import "fmt"

// 参考
// http://blog.zhulinpinyu.com/cracking%20the%20coding%20interview/2013/11/13/rotate-the-matrix-by-90-degrees/
// 顺时针旋转
func rotateImage(matrix [][]int) {
	var i, j int
	row := len(matrix)
	// 左上角 到右下角对角线翻转。
	for i = 0; i < row; i++ {
		for j = i; j < len(matrix[i]); j++ {
			tmp := matrix[i][j]
			matrix[i][j] = matrix[j][i]
			matrix[j][i] = tmp
		}
	}
	// 行对称翻转
	for i = 0; i < row; i++ {
		column := len(matrix[i]) / 2
		for j = 0; j < column; j++ {
			i2 := row - 1 - j
			tmp := matrix[i][j]
			matrix[i][j] = matrix[i][i2]
			matrix[i][i2] = tmp
		}
	}

}

func print(matrix [][]int) {
	var i, j int
	row := len(matrix)
	for i = 0; i < row; i++ {
		column := len(matrix[i])
		for j = 0; j < column; j++ {
			fmt.Printf("a[%d][%d] = %d\n", i, j, matrix[i][j])
		}
	}

}

func main() {
	rotateImage([][]int{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	})

	rotateImage([][]int{
		{5, 1, 9, 11},
		{2, 4, 8, 10},
		{13, 3, 6, 7},
		{15, 14, 12, 16},
	})
	//var  m  [7][7]int
	//matrixChainOrder(&m)
}
