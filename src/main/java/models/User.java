package main.java.models;

public class User implements Comparable<User> {
    Integer age;
    String nickname;

    @Override
    public String toString() {
        return "User{" +
                "age = " + age +
                ", nickname = " + nickname;
    }

    public User(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    @Override
    public int compareTo(User o) {
     return this.age.compareTo(o.age)*(-1);
    }
}
