package Serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
//       Personp person1=new Personp(1,"karl");
//       Personp person2=new Personp(2,"jo");
       Personp[] people = {new Personp(3,"gabe"), new Personp(4,"jery"), new Personp(5,"bob")};
    try {
        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        oos.writeObject(person1);
//        oos.writeObject(person2);

//        oos.writeInt(people.length);
//        for(Personp person : people){
//            oos.writeObject(person);
//        }
        oos.writeObject(people);
        fos.close();
    } catch (IOException e) {
            e.printStackTrace();
    }
    }
}
