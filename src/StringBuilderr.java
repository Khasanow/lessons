public class StringBuilderr {
    public static void main(String[] args){
//        String x="hello";
//        x=x.toUpperCase();
//        System.out.println(x);

//        String string1="hello";
//        String string2=" my";
//        String string3=" friend";
//        String stringAll = string1 + string2 + string3;
//        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friiend");
        System.out.println(sb.toString());
        sb.append(" my").append(" friiiend");
        System.out.println(sb.toString());

    }
}
