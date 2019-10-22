package uppgift1;

import javax.swing.*;
import java.util.ArrayList;

public class AddYouthCenter {
    //Skapar ett objekt som arbetas på genom metoden
    YouthCenter youthCenter = new YouthCenter();

    //Samlar in data till fritidsgård:
    public void addPropertiesNewYouthCenter(){
        String name = JOptionPane.showInputDialog("Enter name");
        youthCenter.setName(name);

    String address = JOptionPane.showInputDialog("Enter address");
        youthCenter.setAddress(address);

    String headOfDepartment = JOptionPane.showInputDialog("Enter head of Department");
        youthCenter.setHeadOfDepartment(headOfDepartment);

    String userName = JOptionPane.showInputDialog("Enter Username");
        youthCenter.setUserName(userName);

    String passWord = JOptionPane.showInputDialog("Enter password");
        youthCenter.setPassWord(passWord);

        //Anropar feedbackmetoden
        FeedbackYouthCenterIsCreated(name,address,headOfDepartment,userName,passWord);
        //Anropar AddCenterToList metoden
        addYouthCenterToList(name,address,headOfDepartment,userName,passWord);
}

//Feedback info to user that YouthCenter is created and send an email.
public void FeedbackYouthCenterIsCreated(String name, String address, String headOfDepartment, String userName, String passWord){

   JOptionPane.showMessageDialog(null,
           "You have created a new Youthcenter with " +
            "\n Name: "+name+
            "\n Address: "+address+
           "\n Head of department: "+headOfDepartment+
           "\n Username: "+userName+
           "\n Password: "+passWord);
}

//Sparar fritidsgården i en arraylist
    public YouthCenter addYouthCenterToList(String name, String address, String headOfDepartment, String userName, String passWord){
       ArrayList<YouthCenter> addYouthCenters = new ArrayList<>();
       addYouthCenters.add(new YouthCenter(name, address, headOfDepartment, userName, passWord ));

        //Anropar SaveToFile från klassen Files
        //Lagrar arraylistan i en fil.
return new YouthCenter(name, address, headOfDepartment, userName, passWord );
    }



}
