//Josue Macias
//March 5, 2023

fun main() {
    val sales = mutableListOf<Int>()
    val stores = listOf("Store 1", "Store 2", "Store 3", "Store 4", "Store 5")
    
    
    for (store in stores) 
  {
        print("Enter today's sales for $store: ")
        val sale = readLine()?.toIntOrNull()
        if (sale != null) {
            sales.add(sale)
        } 
      else {
            println("Invalid input, try again.")
            break
        }
    }
    
    
    for (i in 0 until stores.size) {
        print("${stores[i]}: ")
        val salesInDollars = sales[i] / 100
        for (j in 0 until salesInDollars) 
      {
            print("*")
        }
      
        println()
    }
}
