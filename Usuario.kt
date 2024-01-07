class Usuario(val nome: String) {
    val conteudosConcluidos = mutableListOf<ConteudoEducacional>()

    fun concluirConteudo(conteudo: ConteudoEducacional) {
        conteudosConcluidos.add(conteudo)
    }

    fun verificarConclusao(formacao: Formacao): Boolean {
        return formacao.conteudos.all { conteudo -> conteudosConcluidos.contains(conteudo) }
    }
}