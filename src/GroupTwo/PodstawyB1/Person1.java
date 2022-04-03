package GroupTwo.PodstawyB1;

import java.util.Date;

public class Person1 {
    private Date dateOfBirth;
    private String firstName;
    private String lastName;
    private boolean female;
    private int height;
    private int pesel;

    boolean shorterThan(int limit){
        return height < limit;
    }

    static String getNationality(){
        return "GB";
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
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

    public void setHeight(int height) {
        this.height = height;

    }
    public void setFemale(boolean Female) {
        female = female;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
