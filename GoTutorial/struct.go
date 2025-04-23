package main

import "fmt"

type struct1 struct {
	name string
	age  int
	cgpa float32
}

func main() {

	var sample struct1
	sample.name = "Hii"
	sample.age = 34
	sample.cgpa = 4.45
	fmt.Print(sample)
}
