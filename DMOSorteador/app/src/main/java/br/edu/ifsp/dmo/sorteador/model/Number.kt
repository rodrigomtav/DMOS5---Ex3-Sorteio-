package br.edu.ifsp.dmo.sorteador.model

class Number(n: Int, o: Int) {
    private var number : Int = n
    private var order : Int = o

    fun  getNumber() : Int {
        return this.number
    }

    fun setNumber(n : Int){
        this.number = n
    }

    fun setOrder(n : Int){
        this.order = n
    }

    fun getOrder(): Int{
        return this.order
    }

    override fun toString(): String {
        return "${this.order}° ${this.number}"
    }
}