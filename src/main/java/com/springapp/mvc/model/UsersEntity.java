package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * Created by tabbasi on 29/08/14.
 */
@Entity
@Table(name = "Users", schema = "", catalog = "mydb")
public class UsersEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private Byte disabled;
    private String city;
    private Integer phone;
    private String adVia;
    private String adCiv;
    private String location;


    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "Age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "Disabled")
    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "AdVia")
    public String getAdVia() {
        return adVia;
    }

    public void setAdVia(String adVia) {
        this.adVia = adVia;
    }

    @Basic
    @Column(name = "AdCIV")
    public String getAdCiv() {
        return adCiv;
    }

    public void setAdCiv(String adCiv) {
        this.adCiv = adCiv;
    }

    @Basic
    @Column(name = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (adCiv != null ? !adCiv.equals(that.adCiv) : that.adCiv != null) return false;
        if (adVia != null ? !adVia.equals(that.adVia) : that.adVia != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (disabled != null ? !disabled.equals(that.disabled) : that.disabled != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (disabled != null ? disabled.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (adVia != null ? adVia.hashCode() : 0);
        result = 31 * result + (adCiv != null ? adCiv.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
