fun main() {
    print("Input nama tamu: ")
    val input = readLine()
    val guestList: List<String?> = input?.split(",")?.map { it.trim().ifEmpty { null } } ?: emptyList()

    val registeredGuests = guestList.filterNotNull()
    val unnamedGuests = guestList.count { it == null }

    println("Tamu terdaftar: ${registeredGuests.joinToString(", ")}")
    println("Tamu tanpa nama: $unnamedGuests")
}
