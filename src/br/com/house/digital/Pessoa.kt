package br.com.house.digital

class Pessoa(var nome:String, var rg: Int) {
    override fun equals(other: Any?): Boolean {
        return this.rg == other.rg
    }
}