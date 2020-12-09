package tj.example.mycontacts;

public class ContactsData {

    private int id;
    private String name;
    private String Lastname;
    private String email;
    private String phone;

    public ContactsData(int id, String name, String lastname, String email, String phone) {
        this.id = id;
        this.name = name;
        Lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
