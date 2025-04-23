package main

import("fmt")

func main(){
	var a1 int = 10 //propper way to declare a variable
	var a2 = 20 //inferred
	a6 := 30 //inferred
	var a3 int
	a3 = 40
    var (
	a4 int = 50
	a5 float32 = 4.5
	)
     
     fmt.Print(a1,a2,a3,a4,a5,a6)
}