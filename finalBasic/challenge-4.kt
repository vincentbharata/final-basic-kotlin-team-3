fun isValidEmail(email: String): Boolean {
    return email.contains("@") && email.contains(".")
}
fun main() {
    print("Enter email: ")
    val input = readLine() ?: ""
    println("Input: $input")
    if (isValidEmail(input)) {
        println("Status: Valid")
    } else {
        println("Status: Invalid")
    }
}