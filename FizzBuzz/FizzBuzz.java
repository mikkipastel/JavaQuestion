
public class FizzBuzz {

    public static void main(String []args){
       
       //print output
       FizzBuzzMethod();
    }
    
    public static void FizzBuzzMethod(){
       for (int i = 1; i <= 100; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
          System.out.println(findOfMeowSource("FizzBuzz"));
        } else if (i % 3 == 0) {
          System.out.println(findOfMeowSource("Fizz"));
        } else if (i % 5 == 0) {
          System.out.println(findOfMeowSource("Buzz"));
        }
       }
    }

}
