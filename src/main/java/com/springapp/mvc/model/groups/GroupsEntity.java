package com.springapp.mvc.model.groups;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by tabbasi on 20/09/14.
 */
@Entity
@Table(name = "Groups", schema = "", catalog = "mydb")
public class GroupsEntity {
    private int id;
    private String name;
    private byte[] coverPhoto;
    private byte isClosed;
    private String description;
    private Serializable location;
    private String city;

    @Id
    @Column(name = "Id")
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
    @Column(name = "CoverPhoto")
    public byte[] getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(byte[] coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    @Basic
    @Column(name = "isClosed")
    public byte getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(byte isClosed) {
        this.isClosed = isClosed;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "Location")
    public Serializable getLocation() {
        return location;
    }

    public void setLocation(Serializable location) {
        this.location = location;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupsEntity that = (GroupsEntity) o;

        if (id != that.id) return false;
        if (isClosed != that.isClosed) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (!Arrays.equals(coverPhoto, that.coverPhoto)) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (coverPhoto != null ? Arrays.hashCode(coverPhoto) : 0);
        result = 31 * result + (int) isClosed;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
