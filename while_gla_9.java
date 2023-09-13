import java.util.Scanner;
public class while_gla_9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+ n*i);
        }

    }
}
