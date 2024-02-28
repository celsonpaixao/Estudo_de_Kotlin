fun main() {

    println("Informe o valor inicial da Tabuada")

    val numero: Int = readln().toInt()
    var resultado: Int;
    for (i in 1..12) {
        resultado = numero * i
        println("${numero} X ${i} = ${resultado}")
    }


}