public class while_gla_12 {
    public static void main(String[] args) {
        int n=4563;
        int temp=n;
        int a=0;
        int b=n%10;
        System.out.println("last digit is "+b);
        while(temp!=0)
        {
            a=temp%10;
            temp=temp/10;
        }
        System.out.println("first digit is " +a);
        int c=b;
        b=a;
        a=c;
        System.out.println("last digit is "+b);
        System.out.println("first digit is "+ a);



    }
}

