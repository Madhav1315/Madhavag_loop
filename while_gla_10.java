import java.util.Scanner;
public class while_gla_10 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n > 0)
        {
            int q=n/10;
            n=n/10;
            count++;
        }
        System.out.println(count);

    }
}
