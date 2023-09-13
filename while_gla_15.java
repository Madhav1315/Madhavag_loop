public class while_gla_15 {
    public static void main(String[] args) {
        int n=4563;
        int r=0,pro=1;
        int q;
        while(n>0)
        {
            r=n%10;
            n=n/10;

            pro=pro*r;
        }
        System.out.println(pro);

    }
}
