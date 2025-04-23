package main

import "fmt"

func main() {
	var ch int
	fmt.Scan(&ch)

	switch ch {
	case 1:
		fmt.Print("Hii")
	case 2:
		fmt.Print("Hello")
	default:
		fmt.Print("Hey Enter Different Numbers")
	}
}
