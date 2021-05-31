public class ObjectAndToString {
    public static void main(String[] args){
        Chel h1 = new Chel("bob", 45);
        //h1.toString();
        System.out.println(h1);
    }
}
class Chel{
    private String name;
    private int age;

    public Chel(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+" ,"+age;
    }
}
