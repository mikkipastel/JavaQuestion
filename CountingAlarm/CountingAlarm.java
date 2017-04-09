
public class CountingAlarm {

    public static void main(String []args){
        //initial variable
        int[] volume = {1, 2, 4};
        int S = 5;
        
        //print output
        System.out.println(CountAlarms(volume, S));
    }
    
    public static int CountAlarms(int[] volume, int S){
        int cnt = 0;
        
        //do by 1st round and do this again if S > 0
        do {
        	for (int i = 0; i < volume.length; i++) {
            	S = S - volume[i];
            	cnt++;
             
            	//check S is less than 0
            	if (S <= 0) {
            		break;
            	}
            }
        } while (S > 0);
                
        return cnt;
     }

}
