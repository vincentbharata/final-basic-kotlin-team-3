fun Vowels(sentence: String): Int {
    var count = 0
    for (char in sentence) {
        when (char.lowercaseChar()) {
            'a', 'i', 'u', 'e', 'o' -> count++
        }
    }
    return count
}
fun main() {
    print("Input: ")
    val sentence = readLine() ?: ""
    val totalVowels = Vowels(sentence)
    val totalCharacters = sentence.length
    println("Sentence: $sentence")
    println("Vokal: $totalVowels")
    println("Total Karakter: $totalCharacters")
}