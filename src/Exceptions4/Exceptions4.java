package Exceptions4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) throws IOException, ParseException{
        try {
            run();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void run() throws IOException, ParseException, IllegalArgumentException{

    }
}
