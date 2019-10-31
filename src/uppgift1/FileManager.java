package uppgift1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Den här klassen tar hand om allt som har med filer att göra.
public class FileManager {

    public void saveToFile(ArrayList arr, String dir){
        //Skapa filsökväg som skickas till makeFileDiretion:
        String path = dir;
        File file = new File("./" +path);

        FileOutputStream outFile = new FileOutputStream("./"+send+"/" + center.getName() + ".obj");
        // ObjectOutputStream objOut = new ObjectOutputStream(outFile);




    }




    //Läser från  Fillistan beroende på vad det är för filsökväg osv
    public void readObjectsFromFile(File dir){
        File[] files = dir.listFiles((d, name) -> name.endsWith(".obj"));

    }




}
