package WildcardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
//        test(listOfDogs);

//        Object object= new Object();
    }

//    private  static void test(Animal animal){
//
//    }
    public static void test(List<? super Animal> list){
//        for (Animal animal : list){
//            animal.eat();
//        }
    }
}
