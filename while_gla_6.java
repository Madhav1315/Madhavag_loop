import java.util.Scanner;
public class while_gla_6 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int i=1;
        while(i<n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
