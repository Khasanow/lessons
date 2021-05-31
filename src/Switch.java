import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("введи возраст цифр");
        System.out.println("введите возраст");
//        int age = scanner.nextInt();
//        switch (age){
//            case 0:
//                System.out.println("ты родился цифр");
//                break;
//            case 7:
//                    System.out.println("пошел в школу цифр");
//                    break;
//            case 17:
//                System.out.println("закончил шк цифр");
//                break;
//            default:
//                System.out.println("ни одно из предыдущих цифр");
//        }

        String age2 = scanner.nextLine();
        switch (age2){
            case "ноль":
                System.out.println("ты родился цифр словами");
                break;
            case "семь":
                System.out.println("пошел в школу цифр словами");
                break;
            case "семнадцать":
                System.out.println("закончил шк цифр словами");
                break;
            default:
                System.out.println("ни одно из предыдущих цифр словами");
        }
    }
}
