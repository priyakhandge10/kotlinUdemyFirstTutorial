package io

fun main(args: Array<String>){
    val nameToAges =  mapOf(Pair("priyanka", 20), Pair("priya", 22))
    val nameToAges2 = mapOf(
        "priyanka" to 20,
    "priya" to 22
    )
    println(nameToAges == nameToAges2)
    println(nameToAges.keys)
    println(nameToAges.values)
    println(nameToAges.entries)

    val countryToInhabitants = mutableMapOf(
        "germany" to 80_000_000,
    "USA" to 30_000_000
    )
    countryToInhabitants.put("australis", 23_000_000)
    countryToInhabitants.put("usa", 320_000_000)

    println(countryToInhabitants)
    println(countryToInhabitants.contains("australis"))
    println(countryToInhabitants.containsKey("france"))
    println(countryToInhabitants.containsValue(20_000_000))

    println(countryToInhabitants.get("germany"))
    println(countryToInhabitants.getOrDefault("france",0))

    nameToAges.entries.forEach{
        println("$(it.key) is $(it.value) year old")
    }

}