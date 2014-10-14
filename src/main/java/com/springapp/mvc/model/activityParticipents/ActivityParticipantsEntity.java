package com.springapp.mvc.model.activityParticipents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by tabbasi on 13/10/14.
 */
@Entity
@Table(name = "ActivityParticipants", schema = "", catalog = "mydb")
public class ActivityParticipantsEntity {
    private int id;

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

        ActivityParticipantsEntity that = (ActivityParticipantsEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
