public class BreakContinue {
    public static void main(String[] args){

//        int i=0;
//        while(true){
//            if(i==15){
//                break;
//            }
//            System.out.println(i);
//            i++;//i=i+1
//        }
//        System.out.println("вышли из цикла");

        for(int w=0; w<=15; w++){
            if(w%2==0){
                continue;
            }
            System.out.println("это нечетн число "+w);
        }
    }
}
