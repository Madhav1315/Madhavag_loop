public class while_gla_11 {
    public static void main(String[] args) {
        int n=4563;
        int temp=n;
        int first_dig=0;
        int last_dig=n%10;
        System.out.println("last digit is "+last_dig);
        while(temp!=0)
        {
          first_dig=temp%10;
          temp=temp/10;
        }
        System.out.println("first digit is " +first_dig);
    }
}
