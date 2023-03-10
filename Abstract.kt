abstract class Abstract():Input {
    abstract var name:String
    abstract var price:Double
    abstract var ed:Int
    abstract var vid:String
    abstract var count:Int
    override fun input()
    {
        print("Введите наименование товара: ")
        name=readLine()!!.toString()
        print("Введите цену за $name: ")
        price= readLine()!!.toDouble()
        print("Введите единицы измерения товара: ")
        ed= readLine()!!.toInt()
        print("Введите вид товара: ")
        vid= readLine()!!.toString()
        print("Введите количество товара: ")
        count= readLine()!!.toInt()
    }
    abstract fun Info():String
}