package uppgift1;

import java.io.*;
import java.util.ArrayList;

//Den här klassen tar hand om allt som har med filer att göra.
public class FileManager {

    //Läser in till filen
    public void readObjectToFile(YouthCenter center, String dir){

        YouthCenter addCenter = center;
        String path = dir;
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("./"+path+"/" + addCenter.getName() + ".obj"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            oos.writeObject(addCenter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    //Hämtar från filen
    public void readFromFile(){


    }



}
