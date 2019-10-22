package uppgift1;

import java.io.File;

//Den här klassen tar hand om allt som har med filer att göra.
public class FileManager {

    public File makeFileDirectionToYouthCenter(){
        //Skapar en filsökväg och bestämmer att alla filerna ska lägga sig i en mapp som heter persons:
        File dir = new File("./persons");
        return dir;
    }

    //Läser från  Fillistan med objects av YouthCenters. 
    public void readObjectsFromYouthCenterFile(File dir){
        File[] files = dir.listFiles((d, name) -> name.endsWith(".obj"));

    }


    public void addYouthCenterToFile(){
        //Sparar arraylilsten till en binärfil. Anropas från klassen AddYouthCenter.
    }
}
