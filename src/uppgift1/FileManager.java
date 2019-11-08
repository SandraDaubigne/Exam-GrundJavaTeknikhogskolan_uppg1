package uppgift1;

import java.io.*;

public class FileManager {

    //Läser in till filen
    public void readObjectToFile(YouthCenter center, String dir, String name){

        YouthCenter addCenter = center;
        String path = dir;
        String user = name;
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("./"+path+"/" + user + ".obj"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            oos.writeObject(addCenter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void readObjectFromFile(String dir, String name){

        //en arraylist läser in de uppackade objekten sedan och så kan man orientera sig genom dess index i menyn.
        //Så hämtar alltid arraylisten från filer och de nya som kommit in är med där också.
        String path = dir;
        String user = name;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./"+path+"/" + user + ".obj"));
            ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }



}
