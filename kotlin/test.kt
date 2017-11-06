fun main(args: Array<String>){
	printStuff{println("HHallo")}
}

fun printStuff(op: () -> Unit){
	println("first line")
	op()
	println("second line")
}