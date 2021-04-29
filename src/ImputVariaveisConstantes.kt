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

    print("O numero digitado foi: $numero")

    var soma = 0
    soma = numero + numero
    println("A soma doo numero + numero é: $soma")
}