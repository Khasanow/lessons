package Interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("i am slleeep");
    }

    public void showInfo() {
        System.out.println("id is "+this.id);

    }
}
