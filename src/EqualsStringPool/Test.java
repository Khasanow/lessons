package EqualsStringPool;

public class Test {
    public static void main(String[] args){
//        Animal animal =new Animal(1);
//        Animal animal2=new Animal(1);
//
//        System.out.println(animal.equals(animal2));
        String string1="hello";
        String string2="hello";

        System.out.println(string1.equals(string2));
    }
}
class Animal{
    private int id;
    public Animal(int id){
        this.id=id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
