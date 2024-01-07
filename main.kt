fun main() {
    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 45, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programação Avançada", 75, Nivel.DIFICIL)

    // Criando uma formação
    val formacao = Formacao("Desenvolvedor Kotlin", mutableListOf(conteudo1, conteudo2))

    // Criando usuários
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    // Matriculando usuários e registrando progresso
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    usuario1.concluirConteudo(conteudo1)
    usuario2.concluirConteudo(conteudo1)
    usuario2.concluirConteudo(conteudo2)

    // Verificando a conclusão da formação
    println("João concluiu a formação? ${usuario1.verificarConclusao(formacao)}")
    println("Maria concluiu a formação? ${usuario2.verificarConclusao(formacao)}")

    // Listando inscritos e a duração total da formação
    formacao.listarInscritos()
    println("Duração total da formação: ${formacao.duracaoTotal()} minutos")
}