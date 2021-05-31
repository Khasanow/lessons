import java.time.Period;

public class ClassesAndObjects {//имя публиного класса должно совпадать с именем файла.
    public static void main(String[] args){
        Person3 person1=new Person3();
        //person1.name="Bob";
        person1.age=20;
//        System.out.println("my name is "+ person1.name +" my age " + person1.age);
        person1.speak();
        person1.speak1();
        person1.sayPreved();
        person1.calcYearsToRetirement();

        person1.setName("Bob");
        person1.speak();


        System.out.println();

        Person3 person2 = new Person3();
        person2.name="Jerry";
        person2.age=33;
        person2.speak();
        person2.speak1();
        person2.sayHello();
        person2.calcYearsToRetirement();

        int year1 = person2.calcYearsToRetirement2();
        System.out.println("второму челу до пенсии: " + year1+ "лет");
    //        System.out.println("my name is "+ person2.name +" my age " + person2.age);
    }
}

class Person3{
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

    void calcYearsToRetirement(){
        int years=65-age;
        System.out.println("кол-во лет до пенсии " + age);
    }

    int calcYearsToRetirement2(){
        int years=65-age;
        return years;
    }

    void setName(String username){
        name = username;
    }
}
