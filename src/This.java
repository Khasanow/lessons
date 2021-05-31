public class This {
    public static void main(String[] args){
        Human human1= new Human();
        human1.setAge(18);
        human1.setName("Henry");
        human1.getInfo();

        Human human2= new Human();
        human2.setAge(20);
        human2.setName("Том");
        human2.getInfo();
    }
}
class Human{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//чтобы обратиться внутри метода в классе к переменным класса нужно написать this. перед именем атрибута класса (используется только в сеттерах)
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){
        System.out.println(name+" "+age);
    }
}