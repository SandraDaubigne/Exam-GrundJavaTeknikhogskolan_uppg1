package uppgift1;

import java.io.*;

public class FileManager {

    //Läser in till filen
    public void readObjectToFile(String[] send){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("./"+send[1]+"/" + send[2] + ".obj"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            oos.writeObject(send[0]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readObjectFromFile(String path, String name){

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./"+path+"/" + name + ".obj"));
             ois.readObject();
            System.out.println(ois);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}
