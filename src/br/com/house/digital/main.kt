package br.com.house.digital

fun main() {
    val p1 = Pessoa("Paulo", 123123)
    val p2 = Pessoa("Paulo", 123123)

    println(p1.equals(p2))
}