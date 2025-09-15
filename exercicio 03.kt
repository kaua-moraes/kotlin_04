
fun main () {

    //var frutas = listOf<>()
    var frutas = mutableListOf<String>("maçã", "morango", "amora", "banana", "melão", "manga", "laranja",
        "uva", "mirtilo", "ananas" )

    while (frutas.isNotEmpty()) {
        println("Digite o nome de uma fruta: ")

        var busca = readlnOrNull()?.trim()?.lowercase()

        if (frutas.contains(busca)) {
            println("Sim, a fruta está AQUI!")
            println(frutas)
            frutas.remove(busca)
            println(frutas)
            println("Fruta removida!")
        }

        else  {
            println("Fruta indisponivel. Tente novamente!") }

        if (busca == "todas") {
            println(frutas)
            frutas.clear()
            println("sem frutas") }
    }
}
