package Polimorfism;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("dog is eating");
    }
    public void bark(){
        System.out.println("gavgav");
    }
}
