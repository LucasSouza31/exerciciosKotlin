package desafios


fun main() {

    var consumoTotal = 0.0

    do {
        println("O tipo de energia consumida é eletricidade ou gás natural? \nEscolha uma das opções a seguir:\n 1 para eletricidade \n 2 para gás natural \n 0 para sair")
        var opcao = readlnOrNull()?.toIntOrNull() ?: 1
        if (opcao == 1){
            val fatorEmissao = 0.475
            println("Informe o consumo de eletricidade: ")
            val consumoEnergetico = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            consumoTotal += calculoPegadaDeCarbono(fatorEmissao,consumoEnergetico)
            println("Sua pegada de carbono é ${calculoPegadaDeCarbono(fatorEmissao,consumoEnergetico)} Kg CO2")

        }else if (opcao == 2){
            val fatorEmissao = 2.0
            println("Informe o consumo de gás natural: ")
            val consumoEnergetico = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            consumoTotal += calculoPegadaDeCarbono(fatorEmissao,consumoEnergetico)
            println("Sua pegada de carbono é ${calculoPegadaDeCarbono(fatorEmissao,consumoEnergetico)} Kg CO2")

        }else if (opcao == 0){
            println("Saindo....")
            break
        }

        println("Consumo total: ${consumoTotal} Kg CO2")

        println("Deseja calcular novamente? Escolha uma opção:\n'S' para continuar \n'N' para sair")
        val decisao = readlnOrNull()?.get(0)



    }while (decisao == 's' || decisao == 'S')

}

fun calculoPegadaDeCarbono(fatorEmissao: Double, consumoEnergetico: Double): Double{
    return fatorEmissao*consumoEnergetico
}
