

object Scala2 {
  
  def main(args: Array[String]): Unit = {
    
    val tuples = ("a","b","c");
    
    println(tuples);  //(a,b,c)
    println(tuples._1);
    println(tuples._2);
    println(tuples._3);

    val keyValue = "name" -> "Santhosh";
    println(keyValue._1)  // displays key - name
    println(keyValue._2) // displays value -> Santhosh
    
    
    val list = List("a","b","c");
    println(list)
    println(list(0)) ;;//note Zero
    
    println("*****")
    for(x <- list){
      println(x)
    }
    
    val numList = List(1,4,6,2)
    
    val sum= numList.reduce( (x:Int, y:Int) => x+y )
    println(sum)
    
    val newList=numList.filter((p:Int) => p!=4);
    println(newList)
    
    
    
    
    println(numList.reverse);
    println(numList.sorted);
    println(numList ++ numList );
    println(numList.distinct);
    println(numList.max);
    println(numList.sum);
    println(numList.contains(4));
    
  }
}