package uppgift1;

import javax.swing.*;
import java.util.ArrayList;

public class AddYouthCenter {

    public void addPropertiesNewYouthCenter(){
        String name = JOptionPane.showInputDialog("Enter name");
        String address = JOptionPane.showInputDialog("Enter address");
        String email = JOptionPane.showInputDialog("Enter email");
        String headOfDepartment = JOptionPane.showInputDialog("Enter head of Department");
        String userName = JOptionPane.showInputDialog("Enter Username");
        String passWord = JOptionPane.showInputDialog("Enter password");

        YouthCenter youthCenter = new YouthCenter(name, address, email, headOfDepartment, userName, passWord);

        FeedbackYouthCenterIsCreated(name, address, email, headOfDepartment, userName, passWord);
        addYouthCenterToArrayList(name, address, email, headOfDepartment, userName, passWord);
}

public void FeedbackYouthCenterIsCreated(String name, String address, String email, String headOfDepartment, String userName, String passWord){

   JOptionPane.showMessageDialog(null,
           "You have created a new Youthcenter with " +
            "\n Name: "+name+
            "\n Address: "+address+
                   "\n Email: " +email+
           "\n Head of department: "+headOfDepartment+
           "\n Username: "+userName+
           "\n Password: "+passWord);
}

    public void addYouthCenterToArrayList(String name, String address, String email, String headOfDepartment, String userName, String passWord){

        //Skapa en arrayList
        ArrayList<YouthCenter> addYouthCenters = new ArrayList<>();
        //Lägg till objektet i arraylisten
       addYouthCenters.add(new YouthCenter(name, address, email, headOfDepartment, userName, passWord ));

       //Skapa filsökväg som skickas till makeFileDiretion:
       FileManager fileManager = new FileManager();
       String filedirection = "YouthCenter";
       fileManager.makeFileDirection(filedirection);


       //Lägg till ArrayListens objekt som filer och då har du redan pathen så kan du anropa nästa metod med den.
        fileManager.sendArrayListYouthCenterToFile(filedirection);

    }


}
