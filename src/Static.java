public class Static {
    public static void main(String[] args){

        Human4 h1=new Human4("bob", 30);
        Human4 h2=new Human4("bot", 40);
        //Human4.getDescr();
//        Human4.descr="good";
//        h1.getAllFields();
//        h2.getAllFields();
//        Human4.descr="bad";
//        h1.getAllFields();
//        h2.getAllFields();
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human4 h3=new Human4("boq", 60);
        h3.printNumberOfPeople();



    }
}

class Human4{
    private String name;
    private int age;

    private static int countPeople=0;

    //public static String descr;


//    public Human4(){
//        this("bob", 32);
//    }
//
    public Human4(String name){
        System.out.println("priv iz 2go");
        this.name=name;
    }

    public Human4(String name, int age){
        //System.out.println("priv iz 3go");
        this.name=name;
        this.age=age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public static void getDescr(){
//        System.out.println(descr);
//    }
//    public void getAllFields(){
//        System.out.println(name+" "+age+" "+descr);
//    }
//    public static void printAllFields(){//статический метод может работать только со статическими переменнами
//        System.out.println();
//    }
    public void printNumberOfPeople(){
        System.out.println("number of people is "+ countPeople);
    }

}
