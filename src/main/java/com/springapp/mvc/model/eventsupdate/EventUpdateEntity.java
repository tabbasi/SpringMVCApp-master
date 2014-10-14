package com.springapp.mvc.model.eventsupdate;

import javax.persistence.*;

/**
 * Created by tabbasi on 13/10/14.
 */
@Entity
@Table(name = "EventUpdate", schema = "", catalog = "mydb")
public class EventUpdateEntity {
    private String userId;
    private int id;

    @Basic
    @Column(name = "userID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventUpdateEntity that = (EventUpdateEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
