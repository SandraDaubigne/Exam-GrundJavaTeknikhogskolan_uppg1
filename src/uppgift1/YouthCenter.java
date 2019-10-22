package uppgift1;
//Denna klass representerar objektet fritidsgård och dess attributer

public class YouthCenter {

    private String name;
    private String address;
    private String headOfDepartment;
    private String userName;
    private String passWord;

    public YouthCenter() {

    }

    public YouthCenter(String name, String address, String headOfDepartment, String userName, String passWord, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.headOfDepartment = headOfDepartment;
        this.userName = userName;
        this.passWord = passWord;
    }

    public YouthCenter(String name, String address, String headOfDepartment, String userName, String passWord) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHeadOfDepartment(String headOfDepartment) { this.headOfDepartment = headOfDepartment;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

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


}
