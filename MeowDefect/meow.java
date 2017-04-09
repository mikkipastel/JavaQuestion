
public class Meow {

    public static void main(String []args){
       //try input on console
       //System.out.print("Try your string :");
       //String input = System.console().readLine();
       //String output = findOfMeowSource(input);
       //System.out.println(output);
    	
       //check output for some impossible test case       
       System.out.println(findOfMeowSource("ccat"));
       System.out.println(findOfMeowSource("caat"));
       System.out.println(findOfMeowSource("ct"));
       System.out.println(findOfMeowSource("cxxxxxcat"));
       System.out.println(findOfMeowSource("cut"));
       System.out.println(findOfMeowSource("put"));
       System.out.println(findOfMeowSource("catact"));
       
       //check output for some possible test case
       System.out.println(findOfMeowSource("ssssCsssrrrrAllllllTlllll"));
       System.out.println(findOfMeowSource("cat"));
       System.out.println(findOfMeowSource("cbxat"));
    }
    
    public static String findOfMeowSource(String S){
       String answer = "impossible";
       
       S = S.toUpperCase();
       
       //check sequence of string is [C, A] and [A, T]
       //and add check is not in string (S.indexOf("C") = -1)
       if ((S.indexOf("C") < S.indexOf("A")) && 
    		   //(S.indexOf("C") < S.indexOf("T")) && 
    		   (S.indexOf("A") < S.indexOf("T")) && 
    		   (S.indexOf("C") >= 0)) {
    	  //if not 2nd of C is between [C, A] and [C, T] or 2nd of A is between [A, T]
    	  //if found S.lastIndexOf("C") > S.indexOf("C") 
    	  if ((S.indexOf("C") == S.lastIndexOf("C")) && 
    			  ((S.indexOf("A") == S.lastIndexOf("A"))) && 
    			  ((S.indexOf("T") == S.lastIndexOf("T")))) {
    		  answer = "possible";
    	  }
       }
       
       return answer;
    }

}
