fun main() {
    print("Input nilai: "); val input = readLine()
    val nilai = input?.split(",")?.mapNotNull { it.trim().toIntOrNull() } ?: emptyList()

    println("Nilai: $nilai")
    println("Tertinggi: ${nilai.maxOrNull()}")
    println("Terendah: ${nilai.minOrNull()}")
    println("Rata-rata: ${"%.1f".format(nilai.average())}")
}
