import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);//s ссылается на объект лкасса Scanner
        System.out.println("vvedite chto libo");
        String string = s.nextLine();//в переменной string хранится то что мы ввели с клавы
        System.out.println("ты ввел "+string);

        Scanner q = new Scanner(System.in);//q ссылается на объект лкасса Scanner
        System.out.println("vvedite chislo");
        int x = q.nextInt();//в переменной string хранится то что мы ввели с клавы
        System.out.println("ты ввел chislo "+x);
    }
}
