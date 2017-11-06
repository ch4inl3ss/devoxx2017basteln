import java.util.Random

data class House(val size: Int,val price: Int)

fun main(args: Array<String>){
	val houses= generateHouses()
	for(house in houses) println(house)
}


fun generateHouses(): List<House>{
	val houses: MutableList<House> = mutableListOf()
	for(i in 1..1000) houses.add(generateHouse())
	return houses
}

fun generateHouse():House{
	return House(rand(10, 500),rand(1000,1000000))
}

val random = Random()

fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}


