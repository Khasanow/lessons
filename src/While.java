public class While {
    public static void main(String[] args) {
        boolean q=true;
        boolean w=1>0;
        boolean a=3>=2;
        boolean s=3==5;
        boolean z=3==2;

        int val=0;
        boolean x= val>1;

        while(val<6){
            System.out.println("OK_hello "+val);
            val=val+1;
        }

        System.out.println(q);
        System.out.println(w);
        System.out.println(a);
        System.out.println(s);
        System.out.println(z);
        System.out.println(val);
        System.out.println(x);
    }
}
