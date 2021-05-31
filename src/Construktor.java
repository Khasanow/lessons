public class Construktor {
    public static void main(String[] args){
        Human2 human1 = new Human2();
//        human1.setName("Tom");
//        human1.setAge(32);
    }
}

class Human2{
    private String name;
    private int age;

    public Human2(){
//        System.out.println("прив из первого констр");
        this.name="имя по умолчанию";
        this.age=0;
    }

    public Human2(String name){
        System.out.println("privet from 2 konstruktor");
        this.name = name;
    }

    public Human2(String name, int age){
        System.out.println("hello iz 3go konstr");
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
