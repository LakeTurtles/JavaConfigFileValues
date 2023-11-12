package com.ultima.Senorial.Domain;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    private Integer id;



    ///////////////////////////////////////////////////////////////////////////////////////////

    public Person() {
    }

    public Person(String firstName, String lastName, String age, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Integer.parseInt(age) ;
        this.id = Integer.parseInt(id) ;

    }


    //////////////////////////////////////////////////////////////////////////////////////////////
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + '\'' + ", ID : " + id +
                '}';
    }
}
