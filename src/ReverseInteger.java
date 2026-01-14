import java.util.Scanner;

public class ReverseInteger { 
     public static int reverse(int number){
               int n=number;
               int rev=0;
               while(n!=0){
                    int a=n%10;
                    rev= rev*10 + a;
                    n=n/10;
                    }
                 return rev;
              }

  public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num=sc.nextInt();
         System.out.println(reverse(num));
}       
}
