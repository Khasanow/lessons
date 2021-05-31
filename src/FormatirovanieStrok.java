public class FormatirovanieStrok {
    public static void main(String[] args){
        System.out.printf("this ic a string, %s","NICE");
        System.out.println();
        System.out.printf("this ic a string\n, %d",11);
        System.out.println();
        System.out.printf("String %-10d",123 );
        System.out.println();
        System.out.printf("String %10d",123123);
        System.out.println();
        System.out.printf("String %-10d",123123123);
        System.out.printf("\nString %10d",1231433);
        System.out.println();
        System.out.printf("String %.2f\n",23.6546546);
        System.out.printf("String %.5f\n",23.6546546);
    }
}
