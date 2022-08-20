package main.java.models;

public class UserSet implements Comparable<UserSet> {
    Integer age;
    String nickname;

    @Override
    public String toString() {
        return "User{" +
                "age = " + age +
                ", nickname = " + nickname;
    }

    public UserSet(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    @Override
    public int compareTo(UserSet o) {
     return this.age.compareTo(o.age)*(-1);
    }
}
