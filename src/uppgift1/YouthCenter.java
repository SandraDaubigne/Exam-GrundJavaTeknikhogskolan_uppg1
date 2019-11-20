package uppgift1;

import java.io.Serializable;

public class YouthCenter implements Serializable {

    protected String youthCenter;
    protected String address;
    protected String email;
    protected String phone;
    private String headOfDepartment;
    private String userName;
    private String passWord;

    public YouthCenter(String youthCenter, String address, String email, String phone, String headOfDepartment, String userName, String passWord) {
        this.youthCenter = youthCenter;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.headOfDepartment = headOfDepartment;
        this.userName = userName;
        this.passWord = passWord;
    }

    public YouthCenter() { }

    public void setYouthCenter(String name) {
        this.youthCenter = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) { this.email = email; }

    public void setPhone(String phone) { this.phone = phone; }

    public void setHeadOfDepartment(String headOfDepartment) { this.headOfDepartment = headOfDepartment; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    public String getYouthCenter() {
        return youthCenter;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() { return email; }

    public String getPhone() { return phone; }

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
