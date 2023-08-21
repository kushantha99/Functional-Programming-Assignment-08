def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper) + "roshan")
    println(formatNames("Saman", toLower))
    println("Kumar" + formatNames("a", toUpper))
}

val toUpper = (name: String) => name.map((letter) => if (letter <= 'z' && letter >= 'a') (letter - 32).toChar else letter)

val toLower = (name: String) => name.map((letter) => if (letter <= 'Z' && letter >= 'A') (letter + 32).toChar else letter)

val formatNames = (name: String, formatMethod: String => String) => formatMethod(name)
