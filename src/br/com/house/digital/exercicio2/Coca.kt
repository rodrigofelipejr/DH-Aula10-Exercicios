package br.com.digitalhouse.aula1809.Exercicio2

class Coca (var tamanho: Int, var preco: Double) {
    override fun equals(other: Any?): Boolean {
        //if (this === other) return true

        if (javaClass != other?.javaClass) return false
        other as Coca
        return (tamanho == other.tamanho)
        //if (preco != other.preco) return false
    }

}