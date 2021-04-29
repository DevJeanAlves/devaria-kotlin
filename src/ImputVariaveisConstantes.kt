fun main(argumentos : Array<String>) {

    if(argumentos.isEmpty()) {
        println("Favor infrmar um argumento válido")
        return
    }

    val numero = argumentos[0].toIntOrNull()
    if(numero == null) {
        println("O numero digitado não é um valor válido")
        return
    }

    println("O numero digitado foi: $numero")

    val soma: Int = numero + numero
    println("A soma do numero + numero é: $soma")
}