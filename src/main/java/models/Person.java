package main.java.models;

public class Person {
    Integer userID;
    String email;
    public Person(Integer userID, String email) {

        this.userID = userID;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Person{" +
                "userID=" + userID +
                ", email='" + email + '\'' +
                '}';
    }
}

