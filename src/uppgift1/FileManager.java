package uppgift1;

import java.io.*;

public class FileManager {

    //Läser in till filen
    public void readObjectToFile(YouthCenter center, String path){

        YouthCenter addCenter = center;
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


    public void readObjectFromFile(){

        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream());


    }



}
