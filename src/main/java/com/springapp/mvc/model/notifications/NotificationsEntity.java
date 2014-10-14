package com.springapp.mvc.model.notifications;

import javax.persistence.*;

/**
 * Created by tabbasi on 14/10/14.
 */
@Entity
@Table(name = "Notifications", schema = "", catalog = "mydb")
public class NotificationsEntity {
    private int id;
    private byte seen;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Seen")
    public byte getSeen() {
        return seen;
    }

    public void setSeen(byte seen) {
        this.seen = seen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotificationsEntity that = (NotificationsEntity) o;

        if (id != that.id) return false;
        if (seen != that.seen) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) seen;
        return result;
    }
}
