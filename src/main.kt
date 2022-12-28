fun main() {
    testaComportamentosConta()
    var calculadora = Calculadora();
    val diretorRubens = Diretor(nome = "Rubens", cpf = "111.111.111-50", salario = 20000.0, senha = "44444", plr = 0.0)
    val rafaelGerente = Gerente(
        nome = "Rafael",
        cpf = "111.111.111-50",
        salario = 20000.0,
        senha = "3333"
    )
    calculadora.registra(diretorRubens)
    calculadora.registra(rafaelGerente)
    println(diretorRubens.bonificacao())
    println(rafaelGerente.bonificacao())
    print("bonificação total: " + calculadora.totalBonificacao)

}

