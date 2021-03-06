package contactApp.data;

public class Contact {

    private String firstName;
    private String lastName;
    private String notes;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String notes, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
