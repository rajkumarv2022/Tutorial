package main

import (
	"fmt"
)

func main() {

	var ch int
	fmt.Scan(&ch)
	switch {

	case (ch > 0):
		fmt.Print("Possitive")

	case (ch < 0):
		fmt.Print("Negative")

	default:
		fmt.Print("Zero")

	}
}
