package uppgift1;

import java.io.Serializable;
//Ärver youthCenter, address, email, phone från YouthCenter klassen
public class Apply extends YouthCenter implements Serializable {

    private String name;
    private String use;
    private int amount;

    public Apply(String youthcenter, String address, String email, String phone,String name, String use, int amount ) {
        super.youthCenter = youthcenter;
        super.address = address;
        super.email = email;
        super.phone = phone;
        this.name = name;
        this.use = use;
        this.amount = amount;
    }

    public void setName(String name) { this.name = name; }

    public void setUse(String use) {
        this.use = use;
    }

    public void setAmount(int amount) { this.amount = amount; }


    public String getName() { return name; }

    public String getUse() {
        return use;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "name='" + name + '\'' +
                ", use='" + use + '\'' +
                ", ammount=" + amount +
                ", youthCenter='" + youthCenter + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
