package uppgift1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Den här klassen tar hand om allt som har med filer att göra.
public class FileManager {

    //Beroende på vilket argument som skickas med i metodanropet så skickas en ny fil till den mappen som finns med i metodanropet
    //Dettablir således en helt neutral metod som kan användas till:
    //skapa fritidsgårdar, skapa ansökningar, och skapa rapporter.
    public void makeFileDirection(String dir){
        String path = dir;
        File file = new File("./" +path);
    }

    public void sendArrayListYouthCenterToFile(String dir){
        
        String send = dir;

        FileOutputStream outFile = new FileOutputStream("./"+send+"/" + center.getName() + ".obj");
       // ObjectOutputStream objOut = new ObjectOutputStream(outFile);

    }


    //Läser från  Fillistan beroende på vad det är för filsökväg osv
    public void readObjectsFromFile(File dir){
        File[] files = dir.listFiles((d, name) -> name.endsWith(".obj"));

    }




}
