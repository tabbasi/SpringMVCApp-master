package com.springapp.mvc.model.address;

import javax.persistence.*;

/**
 * Created by tabbasi on 12/10/14.
 */
@Entity
@Table(name = "Cap", schema = "", catalog = "mydb")
public class CapEntity {
    private int id;
    private String cap;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CAP")
    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CapEntity capEntity = (CapEntity) o;

        if (id != capEntity.id) return false;
        if (cap != null ? !cap.equals(capEntity.cap) : capEntity.cap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cap != null ? cap.hashCode() : 0);
        return result;
    }
}
