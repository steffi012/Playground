import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int lastn=n%10;
      while(n>10)
      {
        n=n/10;
      }
      sum=n+lastn;
      System.out.println(sum);
      
	    // Type your code here
	}
}