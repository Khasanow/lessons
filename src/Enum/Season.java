package Enum;

public enum Season {
    SUMMER(35), WINTER(-56), AUTUMN(20), SPRING(0);

    private int temp;
    Season(int temp){
        this.temp=temp;
    }
    public  int getTemp(){
        return temp;
    }
}
