class Calculadora
{
    var totalBonificacao: Double = 0.0;

    fun registra(funcionario: Funcionario) {
        totalBonificacao += funcionario.bonificacao()
    }

    fun registra(funcionario: Gerente) {
        totalBonificacao += funcionario.bonificacao()
    }

    fun registra(funcionario: Diretor) {
        totalBonificacao += funcionario.bonificacao()
    }

//    fun getTotalBonificacao(): Double {
//        return this.totalBonificacao
//    }
}