package br.com.house.digital.exercicio3

fun main() {
    val alunos = mutableListOf<Aluno>()
    val aluno1 = Aluno("Sarah", 1)
    val aluno2 = Aluno("Alex", 2)
    val aluno3 = Aluno("Rodrigo", 3)
    val aluno4 = Aluno("Rodrigo", 4)
    alunos.addAll(listOf(aluno1, aluno2, aluno3, aluno4))

    var aluno5 = Aluno("Maria", 1)
    println(alunos.contains(aluno5))
}