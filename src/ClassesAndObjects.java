import java.time.Period;

public class ClassesAndObjects {//имя публиного класса должно совпадать с именем файла.
    public static void main(String[] args){
        Person person1=new Person();
        person1.name="Bob";
        person1.age=20;
//        System.out.println("my name is "+ person1.name +" my age " + person1.age);
        person1.speak();
        person1.speak1();
        person1.sayPreved();

        System.out.println();

        Person person2 = new Person();
        person2.name="Jerry";
        person2.age=33;
        person2.speak();
        person2.speak1();
        person2.sayHello();
//        System.out.println("my name is "+ person2.name +" my age " + person2.age);
    }
}

class Person{
//у класса может быть: 1-данные(поля).
// 2- действия которые он может совершать (методы)
    String name;
    int age;

    void speak(){
        System.out.println("my name is " + name+" MY AGE "+ age);
    }

    void speak1(){
        for (int i=0; i<5; i++){}
        System.out.println(" Hello, my name is " + name+" my age "+ age);
    }
    void sayHello(){
        System.out.println("Privetiki pistoletiki");
    }
    void sayPreved(){
        System.out.println("PREVED_BADMOTHERFUCKER_MEDVDED");
    }
}
