import Packet1.Person;

import java.util.logging.SocketHandler;


public class TestModific extends Person {

    public static void main(String[] args){
/*public,
private,
default(доступно в пределах этого пакета),
protected(доступны в пределах одного пакетаб доступны всем подклассаб даже если эти подклассы вне паккета)
 */
        Person person1=new Person();
        person1.name="Jo";
        System.out.println(Person.CONSTANT);
        Person p1 = new Person();
        //System.out.println(p1.name1);// нельзя тк name1 protected
    }
}
