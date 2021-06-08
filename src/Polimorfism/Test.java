package Polimorfism;

public class Test {
    public static void main(String[] args){

//        Dog dog=new Dog();
//        //upcasting - восходящее преобразование
//        Animal animal=dog;
//
//
//        //downcasting - нисходящее преобразование
//        Dog dog2=(Dog) animal;]
//        dog2.bark();
        Animal a = new Animal();
        Dog dog=(Dog) a;
        dog.bark();

    }

}
