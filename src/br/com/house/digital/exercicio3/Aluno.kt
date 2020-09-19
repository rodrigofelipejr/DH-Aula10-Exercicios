package br.com.house.digital.exercicio3

class Aluno (var nome: String, var numAluno: Int) {
    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false

        other as Aluno

        return numAluno === other.numAluno
    }

}