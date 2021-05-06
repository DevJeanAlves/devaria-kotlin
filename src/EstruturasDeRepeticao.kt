fun main(args : Array<String>) {
    // for subindo
    for(i in args.indices)
        println("Percorrendo os argumentos posição: $i e valor ${args[i]}")

    // for decrescente
    for(iDecrescente in args.size-1 downTo 0){
        println("Percorrendo os argumentos de forma decrescente possição: $iDecrescente e valor: ${args[iDecrescente]}")
    }

    //for each
    for(argumento in args ){
        println("Percorrendo os argumentos em argumento: $argumento")
    }

    //while

    var contadorArgumentosLidos = 0
    while (contadorArgumentosLidos < args.size){
        println("Percorrendo os argumentos em while argumentos lidos:${++contadorArgumentosLidos} valor lido: ${args[contadorArgumentosLidos-1]} ")
    }

    //do while
    var contadorDeLoops = 0
    do{
        println("Percorrendo os argumentos comm do while, total loops: $contadorDeLoops" +
        " e valor lido ${args[contadorDeLoops]}")
        contadorDeLoops++
    }while(contadorDeLoops < args.size)
}



