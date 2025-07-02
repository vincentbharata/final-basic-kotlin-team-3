fun main() {
    val input = readLine() ?: ""
    val expenses = input.split(",").map { it.trim().toInt() }
    println("Pengeluaran: $expenses")
    println("Total: ${expenses.sum()}")
    println("Terbesar: ${expenses.maxOrNull()}")
    println("Terkecil: ${expenses.minOrNull()}")
}