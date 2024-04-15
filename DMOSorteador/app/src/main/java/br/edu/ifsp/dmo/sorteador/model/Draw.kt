package br.edu.ifsp.dmo.sorteador.model

class Draw(private val border: Int = 0) {
    private lateinit var strategy: SorteioStrategy
    private var history = ArrayList<Number>()

    init{
        if (border == 0)
            this.strategy = DefaultLimit
        else
            this.strategy = DefinedLimit(border)
    }

    fun getNumber(): Number {
        var number: Number
        do{
            number = Number(strategy.nextNumber(),history.size)

        }while (!history.add(number))
        return number
    }
    fun getHistory() = history
    fun getLowBorder() = strategy.getLowBorder()
    fun getHighBorder() = strategy.getHighBorder()
}