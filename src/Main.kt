fun main() {

//    Criando uma Lista de Objectos Mutlavel da Class Pessoa

    val pessoas: MutableList<Pessoa> = mutableListOf(
        Pessoa("Celson Fernando Milombe Paixão", 18, 54.9, altura = 1.89),
        Pessoa("João José Milombe", 22, 63.8, 1.67)
    )

//    Intput de um novo Nome de Usuário para minha lista

    println("Vamos adicionar uma novo Usuario a sua lista")

    println("Informe o nome")
    val newName: String = readln()

    //    Intput da idade o novo usuário para minha lista
    println("Informe a idade")
    val newOld: Int = readln().toInt()

    //    Intput do pesso o novo usuário para minha lista
    println("Informe o peso")
    val newweight: Double = readln().toDouble()

    //    Intput da altura o novo usuário para minha lista
    println("Informe a altura")
    val newheigh: Double = readln().toDouble()

    //    Adicionando os novos dados a lista
    pessoas.add(Pessoa(newName, newOld, newweight, newheigh))

    //    Revertendo a Lista do Ultimo ao Primeiro
    pessoas.reverse()

    //    Percorrendo e imprimindo a lista da objectos

    pessoas.forEach { pessoa ->
        println(" ${pessoa.nome} está com ${pessoa.idade} anos de idade, pesa ${pessoa.peso} Kg e mede ${pessoa.altura} metros de altura ")

    }


}