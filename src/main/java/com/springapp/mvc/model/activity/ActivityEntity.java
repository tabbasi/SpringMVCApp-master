package com.springapp.mvc.model.activity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by tabbasi on 13/10/14.
 */
@Entity
@Table(name = "Activity", schema = "", catalog = "mydb")
public class ActivityEntity {
    private int id;
    private int activityTypeId;
    private String day;
    private Time timing;
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
    @Column(name = "ActivityTypeID")
    public int getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(int activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    @Basic
    @Column(name = "Day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Basic
    @Column(name = "Timing")
    public Time getTiming() {
        return timing;
    }

    public void setTiming(Time timing) {
        this.timing = timing;
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

        ActivityEntity that = (ActivityEntity) o;

        if (activityTypeId != that.activityTypeId) return false;
        if (id != that.id) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (timing != null ? !timing.equals(that.timing) : that.timing != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + activityTypeId;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (timing != null ? timing.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
