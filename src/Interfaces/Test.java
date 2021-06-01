package Interfaces;

public class Test {
    public static void main(String[] args){
//        Animal animal1=new Animal(2);
//        Person person1=new Person("jo");
//        animal1.sleep();
//        person1.sayHello();
//        System.out.println();
//        animal1.showInfo();
//        person1.showInfo();
//        Info info1=new Animal(1);
//        Info info2=new Person("jo");
        Info animal1=new Animal(1);
        Info person1=new Person("jo");
//        info1.showInfo();
//        info2.showInfo();
        System.out.println();
//        outputInfo(info1);
//        outputInfo(info2);
        System.out.println();
        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
