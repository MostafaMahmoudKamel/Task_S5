//1: Drawing a Right-Angled Triangle
fun drawingRightTriangle() {
    for (line in 0 until 5) {
        for (j in 0..line) {
            print("*")
        }
        println()
    }
    println()
}


//2: Drawing an Isosceles Triangle
fun drawingIsoscelesTriangle() {
    for (line in 1..5) {

        for (space in (4 - line) * 2 downTo 0) {
            print(" ")
        }
        for (star in 1 until line * 2) {
            print("* ")
        }
        println()
    }
    println()
}

//3: Drawing a Pyramid
fun drawingPyramid() {
    for (line in 1..5) {

        for (space in (4 - line) downTo 0) {
            print(" ")
        }
        for (star in 1 until line * 2) {
            print("*")
        }

        println()
    }
    println()
}

//4: Counting Vowels in a String
fun countVowelsInString(string: String): Int {
    return string.count { it in "aeiou" }
}

//5: Reversing a String
fun String.reverseString(): String {
    return this.reversed()
}

//6: Filtering Digits from a String
fun String.filterStringDigit(): String {
    return this.filter { it.isDigit() }
}


//7: Splitting a String into Words
fun String.splitString(): List<String> {
    return this.split(" ")
}


//9: Removing Spaces from a String
fun String.removeSpacesFromString(): String {
    return this.replace(" ", "")

}

fun main() {

    println("Drawing a Right-Angled Triangle")
    drawingRightTriangle()


    println("Drawing an isosceles triangle")
    drawingIsoscelesTriangle()


    println("Drawing a pyrmid")
    drawingPyramid()


    println("Counting Vowels in a string")
    var count = countVowelsInString("kotlin is awesome")
    println("Number of Vowels :$count \n")


    println("Reversing a String")
    var str = "Kotlin"
    println("Reversed: ${str.reverseString()}\n")


    println("Filtering digit from a String")
    var stringWithDigit = "K0t1l1n 2s 4w3s0m3"
    println("Digits: ${stringWithDigit.filterStringDigit()}\n")


    println("Spliting a string into words")
    var stringWords = "Kotlin is a great language"
    var words = stringWords.splitString()
    words.forEach { println(it) }
    println()


    println("counting  of String word")
    println("${words.count()}\n")


    println("Removing spaces from string ")
    println("${stringWords.removeSpacesFromString()}")


}
















