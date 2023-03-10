import kotlinx.coroutines.*
suspend fun main(){
    GlobalScope.launch{
        for(i in 1..10) {
            println("$i раз")
        }
    }
    runBlocking {delay (30000L)}
}