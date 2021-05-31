public class СlassesAndObjectsInkaps {
    public static void main(String[] args){

        Person person1 = new Person();
        person1.setName("ывавы");
        person1.setAge(-1);

        System.out.println("выводим возраст в main методе: "+person1.getAge());
        System.out.println("выводим имя в main методе: "+person1.getName());


    }
}

class Person{
    private String name;
    private int age;

        public void setName(String userName){
            if (userName.isEmpty()){
                System.out.println("пустое имя");
            }else{
                name = userName;
            }

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int userAge) {
            if (userAge<0){
                System.out.println("возраст не может быть отрицательный");
            }else{
                age = userAge;
            }
        }

    int CalcYearsToRet(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for (int i=0; i<2; i++){
            System.out.println("меня зовут "+ name+", мне "+ age+ " лет");
        }
    }

    void sayHello(){
        System.out.println("PRIVET !");
    }

}
