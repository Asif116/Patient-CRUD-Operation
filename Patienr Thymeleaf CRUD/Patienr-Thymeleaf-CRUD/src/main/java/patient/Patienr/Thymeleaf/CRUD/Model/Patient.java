package patient.Patienr.Thymeleaf.CRUD.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @NotNull(message = "Fill Minimum 1 to 15 Character")
    @Size(min=1,max = 15,message = "Fill Minimum 1 to 15 Character")
    @Column(name="first_name")
    private String firstName;

    @NotNull(message = "Fill Minimum 1 to 15 Character")
    @Size(min=1,max = 15,message = "Fill Minimum 1 to 15 Character")
    @Column(name="last_name")
    private String lastName;


    @Column(name="age")
    private int age;


    @Column(name="email")
    private String email;
    @Column(name="mobile_number")


    private Long mobileNumber;

    @Column(name="gender")
    private String gender;
    @Column(name="city")
    private String city;
    @Column(name="symptoms")
    private String symptoms;

    public Patient(){

    }

    public Patient(String firstName, String lastName, int age, String email, Long mobileNumber, String gender, String city, String symptoms) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.city = city;
        this.symptoms = symptoms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", symptoms='" + symptoms + '\'' +
                '}';
    }
}
