package br.com.house.digital

class Pessoa(var nome:String, var rg: Int) {
    override fun equals(other: Any?): Boolean {
        if (other !is Pessoa) return false
        return (this.rg == other.rg)
    }
}