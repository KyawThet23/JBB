package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CatchDemo {

    public static void main(String[] args) {
        show();
    }

    public static void show(){

        try {
            var reader = new FileReader("file.txt");
            var read = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File is read");
        }catch (IOException | ParseException e){
            e.printStackTrace();
            System.out.println("File does not exists");
        }
    }

}
