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

        ArrayList<YouthCenter> addYouthCenters = new ArrayList<>();
        addYouthCenters.add(new YouthCenter(name, address, email, headOfDepartment, userName, passWord ));

        FileManager fileManager = new FileManager();
        String path = "youthcenter";
        fileManager.saveToFile(addYouthCenters, path);


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


}
