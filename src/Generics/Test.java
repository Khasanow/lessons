package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        /*Java 5*/
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");
        animals.add(ourAnimal);


        String animal=(String) animals.get(1);
        System.out.println(animal);

        /* с появлением дженериков */

        List<String> animals2= new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");//1
        animals2.add("frog");

        String animal2=animals2.get(1);

        //System.out.println(animal2);

        /*Java 7*/
        List<String> animals3 = new ArrayList<>();

    }
}
class Animal{

}
