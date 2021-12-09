package wojciech.hotelsapplication.remote.rest.dto.request;

public class PersonDto {
    private String name;
    private String phone;
    private String address;
    private String mail;

    public PersonDto() {
    }

    public PersonDto(String name, String phone, String address, String mail) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
