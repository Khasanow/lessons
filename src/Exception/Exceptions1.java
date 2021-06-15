package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args){
        File file=new File("asd");
        try {
            Scanner scanner=new Scanner(file);
            System.out.println("после сканнер а ");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        System.out.println("после блока трай кетч");


    }
    public void readFile() throws FileNotFoundException{
        File file=new File("asd");
//        Scanner scanner= new Scanner();

    }
}
