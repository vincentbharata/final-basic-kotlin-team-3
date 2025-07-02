fun main() {
    print("Input nilai: "); val input = readLine()
    val score = input?.split(",")?.mapNotNull { it.trim().toIntOrNull() } ?: emptyList()

    println("Nilai: $score")
    println("Tertinggi: ${score.maxOrNull()}")
    println("Terendah: ${score.minOrNull()}")
    println("Rata-rata: ${"%.1f".format(score.average())}")
}
