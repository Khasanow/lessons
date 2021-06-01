package Interfaces;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello");
    }
    @Override//эта аннотация обязывает имя нашего реализуемого метода в классе персон такое же что и имя в интерфейся
    public void showInfo() {
        System.out.println("name is "+ this.name);

    }
}
