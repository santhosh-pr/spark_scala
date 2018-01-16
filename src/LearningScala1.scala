

object LearningScala1 {
  
    def main(args: Array[String]) {
     /* val hello: String ="Hallo"
      println(hello)
      
      hello + "hi"
         println(hello)
       
     var  helloMutable: String =hello
     helloMutable= helloMutable+" Hi"
      println(helloMutable);
     
      
      println(s"HI $helloMutable")*/
      
      
    /*  val number = 3                                  
      number match {
      	case 1 => println("One")
      	case 2 => println("Two")
      	case 3 => println("Three")
      	case _ => println("Something else")
 	   }   */
      
      
     /* for (x <- 1 to 4) {
 	      	val squared = x * x
 		    println(squared)
 	    }         */
      
       //println({val x = 10; x + 20})  
       
      // println(square(10));
      
      println(square1(10, x=> x * x));
      
    }
    
    
    
    def square(x :Int) :Int = {x*x};
    
    
    def square1(x :Int, f: Int => Int) :Int ={
      f(x);
    }
    
    
    
  
}