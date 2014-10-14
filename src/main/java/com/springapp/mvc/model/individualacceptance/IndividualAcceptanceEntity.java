package com.springapp.mvc.model.individualacceptance;

import javax.persistence.*;

/**
 * Created by tabbasi on 14/10/14.
 */
@Entity
@Table(name = "IndividualAcceptance", schema = "", catalog = "mydb")
public class IndividualAcceptanceEntity {
    private int id;
    private int groupId;
    private Integer userId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GroupID")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndividualAcceptanceEntity that = (IndividualAcceptanceEntity) o;

        if (groupId != that.groupId) return false;
        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + groupId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
