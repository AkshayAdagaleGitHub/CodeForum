
import java.util.Scanner;

public class vavo {
   
	private static int Queries(int L, int v, int l, int r) {
	   int count=0;
	   int stop=0;
	   for(int i=1;i<=L;i++) {		   
		   stop =i*v;
		   if(stop <= L) {
			   if(stop>=l && stop<=r){
				  continue;
			   }else {
				   count++;
			   }
		   }
		   
	   }
	   return count;
   }
   public static void main (String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           int numInps = sc.nextInt();
           while (numInps-- > 0) {
               int L = sc.nextInt();
               int v = sc.nextInt();
               int l = sc.nextInt();
               int r = sc.nextInt();               
               System.out.println(Queries(L,v,l,r));            
           }        
       }        
   }

}
