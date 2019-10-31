package uppgift1;

import java.io.*;
import java.util.ArrayList;

//Den här klassen tar hand om allt som har med filer att göra.
public class FileManager {

    public void saveToFile(ArrayList arr, String dir, String user){

        String path = dir;
        String name = user;

        //Skapa filsökväg
        File file = new File("./" +path);

        //Skicka till filen
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./"+path+"/" + name + ".obj"));

    }

    public void readFromFile(){
        //skapar objekt av filerna igen så att de blir läsbara.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream());
    }




    //Läser från  Fillistan beroende på vad det är för filsökväg osv
    public void readObjectsFromFile(File dir){
        File[] files = dir.listFiles((d, name) -> name.endsWith(".obj"));

    }




}
