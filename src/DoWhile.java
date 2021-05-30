import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //while проверяет условие, а затем выполняет инструкции
        System.out.println("введи 5 (while)");
        int val = scanner.nextInt();
        while (val!=5){
            System.out.println("введи 5 (while)");
            val = scanner.nextInt();
        }
        System.out.println("вы ввели 5 (while)");

        Scanner w = new Scanner(System.in);//do while сначала проверяет инструкции, а затем выполняет условия
        int value;
        do {
            System.out.println("введи 5 (dowhile)");
            value=w.nextInt();
        }while (value!=5);
        System.out.println("вы ввели 5 (dowhile)");
    }
}
