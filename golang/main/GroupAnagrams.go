package main

import "fmt"
import "sort"

func groupAnagrams(strs []string) [][]string {
	var i int
	for i = 0; i < len(strs); i++ {
	}
	var emptyStr [][]string
	return emptyStr
}

func main() {
	anagrams := groupAnagrams([]string{"eat", "tea", "tan", "ate", "nat", "bat"})
	var i, j int
	for i = 0; i < len(anagrams); i++ {
		for j = 0; j < len(anagrams[i]); j++ {
			fmt.Printf("a[%d][%d] = %s\n", i, j, anagrams[i][j])
		}
	}

	fruits := []string{"peach", "banana", "kiwi"}
	sort.Sort(ByLength(fruits))
	fmt.Println(fruits)
}

// 为了能够使用自定义函数来排序，我们需要一个
// 对应的排序类型，比如这里我们为内置的字符串
// 数组定义了一个别名ByLength
type ByLength []string

// 我们实现了sort接口的Len，Less和Swap方法
// 这样我们就可以使用sort包的通用方法Sort
// Len和Swap方法的实现在不同的类型之间大致
// 都是相同的，只有Less方法包含了自定义的排序
// 逻辑，这里我们希望以字符串长度升序排序
func (s ByLength) Len() int {
	return len(s)
}
func (s ByLength) Swap(i, j int) {
	s[i], s[j] = s[j], s[i]
}
func (s ByLength) Less(i, j int) bool {
	return len(s[i]) < len(s[j])
}
