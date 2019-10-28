package uppgift1;

import java.io.Serializable;

public class YouthCenter implements Serializable, Saveable {

    private String name;
    private String address;
    private String email;
    private String headOfDepartment;
    private String userName;
    private String passWord;

    //En konstruktor som tar in alla parametrar
    public YouthCenter(String name, String address, String email, String headOfDepartment, String userName, String passWord) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.headOfDepartment = headOfDepartment;
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHeadOfDepartment(String headOfDepartment) { this.headOfDepartment = headOfDepartment; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEmail(String email) { this.email = email; }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() { return email; }

}
