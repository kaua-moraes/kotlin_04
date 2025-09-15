fun main() {

    //Lista de planetas
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    print("Digite um planeta: ")
    val planet = readLine() ?: ""

    // Verifica se o planeta está na lista
    for (planeta in planetas) {
        if (planeta == planet) {
            println("O planeta $planet está na lista!")
            return
        }
    }

    println("O planeta $planet NÃO está na lista!")
}