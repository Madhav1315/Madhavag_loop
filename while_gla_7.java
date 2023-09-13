import java.util.Scanner;
public class while_gla_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i=2,sum=0;
        while (i<=n)
        {
                sum=sum+i;
                i=i+2;
        }
        System.out.println(sum);

    }
}
