fun main() {
namesOfStudent(arrayOf("Naima", "Nyawera", "Natete","Shamim"))
    countryNames(arrayOf())
    takesNumbers(arrayOf())
    var allNames = takesInNames(arrayOf("Saido","Cudra","Swabrina"))
   println(allNames)

}

fun namesOfStudent(names:Array<String>){
    println(names.contentToString())

}

fun countryNames(cities:Array<String>){
    var cities = arrayOf("harare", "mumbai","dodoma","jakarta")
    cities.forEach { names ->
        println(names.capitalize())
    }
}


fun takesNumbers(arrayOf: Array<Int>) {
    var numbers =arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1].plus(numbers[4])
    println(sum)
    var index = numbers.indexOf(158)
    println(index)
    var sortedNums = numbers.sortedArray()
    println(sortedNums.contentToString())
}
fun takesInNames(name: Array<String>) : String {
    var names = name.contentToString()
    return names

}