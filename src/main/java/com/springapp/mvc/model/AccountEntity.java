package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * Created by tabbasi on 29/08/14.
 */
@Entity
@Table(name = "Account", schema = "", catalog = "mydb")
public class AccountEntity {
    private int id;
    private String name;
    private String email;
    private String password;
    private Boolean verified;
    private Integer recognitionValue;
    private Integer usersId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Verified")
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Basic
    @Column(name = "RecognitionValue")
    public Integer getRecognitionValue() {
        return recognitionValue;
    }

    public void setRecognitionValue(Integer recognitionValue) {
        this.recognitionValue = recognitionValue;
    }

    @Basic
    @Column(name = "Users_ID")
    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (id != that.id) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (recognitionValue != null ? !recognitionValue.equals(that.recognitionValue) : that.recognitionValue != null)
            return false;
        if (usersId != null ? !usersId.equals(that.usersId) : that.usersId != null) return false;
        if (verified != null ? !verified.equals(that.verified) : that.verified != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (verified != null ? verified.hashCode() : 0);
        result = 31 * result + (recognitionValue != null ? recognitionValue.hashCode() : 0);
        result = 31 * result + (usersId != null ? usersId.hashCode() : 0);
        return result;
    }
}
