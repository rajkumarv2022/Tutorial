package main

import (
	"fmt"
)

func main() {
	var arr1 = []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	slice1 := []int{1, 2, 3, 4}
	fmt.Println(slice1)
	fmt.Print(len(slice1), cap(slice1))
	fmt.Println()
	slice2 := arr1[5:]
	fmt.Println(slice2)
	slice3 := make([]int, 4, 5)
	slice3[0] = 5
	slice3[1] = 6
	fmt.Println(slice3)
}
