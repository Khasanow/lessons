public class Arrays {
    public static void main(String[] args) {
        int number = 10;
//        char x='a';
//        String s="hello";
//        String s1=new String("hello");
        int[] numbers = new int[5];// numbers ссылается на  [массив]
//        numbers[0]=10;
//        numbers[1]=20;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);

        }
    }
}
