fun main() {
    println("Favor informar o nome do convidado:")
    val nome = readLine()

    if(nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("Nome inválido.")
        return
    }

    println("Favor informar a idade do convidado")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0) {
        println("A idade informada não é válida")
        return
    }

    var estaConvidado = false
    when(nome){
        "Kaique" -> estaConvidado = true
        "Ale" -> estaConvidado = true
        "Ricardo" -> estaConvidado = true
        else -> estaConvidado = false
    }

    if (estaConvidado && idade >= 18) {
        println("Seja bem vindo")
    }else if(!estaConvidado){
        println("voce não esta na lista de convidados")
    }else{
        println("você não tem 18 anos para entrar na festa.")
    }

}