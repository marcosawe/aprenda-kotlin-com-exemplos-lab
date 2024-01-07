data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }

    fun duracaoTotal(): Int {
        return conteudos.sumOf { it.duracao }
    }

    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { usuario -> println(usuario.nome) }
    }
}