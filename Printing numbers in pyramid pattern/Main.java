import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int val=1;
      for(int i=1;i<=n;i++)
      {
        for(int space=1;space<=n-i;space++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print(val+" ");
          val++;
        }
         System.out.println();
      }
    	// Type your code here
    }    
}