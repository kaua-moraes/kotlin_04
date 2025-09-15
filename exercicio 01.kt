
fun main() {

    //lista
    val estudantes = mutableListOf<String>()

    //enquanto for verdadeiro
    while (true) {
        print("Digite o nome do estudante ou PARE para encerrar: ")
        val nome = readLine()?.trim() ?: ""

        if (nome.equals("PARE", ignoreCase = true)) {
            break
        }

        if (nome.isNotEmpty()) {
            estudantes.add(nome)
        }
    }

    println("\nQuantidade de estudantes cadastrados: ${estudantes.size}")
    println("Lista de estudantes:")
    for (estudante in estudantes) {
        println("- $estudante")
    }

}
