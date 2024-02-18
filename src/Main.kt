fun main() {
    val pessoas: MutableList<Pessoa> = mutableListOf(
        Pessoa("Celson Fernando Milombe Paixão", 18, 54.9, altura = 1.89),
        Pessoa("João José Milombe", 22, 63.8, 1.67)
    )

    println("Vamos adicionar uma novo Usuario a sua lista")

    println("Informe o nome")
    val newName: String = readln()

    println("Informe a idade")
    val newOld: Int = readln().toInt()

    println("Informe o peso")
    val newweight: Double = readln().toDouble()

    println("Informe a altura")
    val newheigh: Double = readln().toDouble()

    pessoas.add(Pessoa(newName, newOld, newweight, newheigh))

    pessoas.reverse()

    pessoas.forEach { pessoa ->
        println(" ${pessoa.nome} está com ${pessoa.idade} anos de idade, pesa ${pessoa.peso} Kg e mede ${pessoa.altura} metros de altura ")

    }


}