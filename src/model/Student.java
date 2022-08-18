package model;

import java.util.Date;

public class Student {
    protected String id;
    protected String name;
    protected boolean sex;
    protected String email;
    protected String phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    protected Date birthday;

    public Student(String id, String name, boolean sex, String email, String phoneNumber, Date birthday){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.birthday=birthday;
    }

    public Student(){

    }

}
