class Tovar(var name1:String, var price1:Double, var ed1:Int,var vid1:String,var count1:Int):Abstract(){
    override var name=name1
    override var price=price1
    override var ed=ed1
    override var vid=vid1
    override var count=count1
    override fun Info():String
    {
        return "Информация о товаре:\nНаименование товара: ${name}\nЦена за 1 товар: ${price}\nЕдиницы измерения товара (${name}): ${ed}\nВид товара: ${vid}\nКоличество товара на складе: ${count}"
    }
    fun Money():Boolean
    {
        print("Сколько у вас денег?: ")
        var Money= readLine()!!.toDouble()
        if (Money<0.0)
        {

            println("Введена отрицательная сумма денег!")
        }


    }

}