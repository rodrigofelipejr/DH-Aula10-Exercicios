package br.com.house.digital.exercicio1

import br.com.house.digital.exercicio1.Pessoa

fun main() {
    val pessoa1 = Pessoa("Paulo", 123123)
    val pessoa2 = Pessoa("Flávio", 123123)

    println("Pessoa1(${pessoa1.nome}) == Pessoa2(${pessoa2.nome}): RE: ${pessoa1.equals(pessoa2)}")
}