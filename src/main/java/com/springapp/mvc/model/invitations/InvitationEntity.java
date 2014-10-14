package com.springapp.mvc.model.invitations;

import javax.persistence.*;

/**
 * Created by tabbasi on 14/10/14.
 */
@Entity
@Table(name = "Invitation", schema = "", catalog = "mydb")
public class InvitationEntity {
    private int id;
    private int groupId;
    private int invitingUserId;
    private int invitedUserId;

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
    @Column(name = "InvitingUserID")
    public int getInvitingUserId() {
        return invitingUserId;
    }

    public void setInvitingUserId(int invitingUserId) {
        this.invitingUserId = invitingUserId;
    }

    @Basic
    @Column(name = "InvitedUserID")
    public int getInvitedUserId() {
        return invitedUserId;
    }

    public void setInvitedUserId(int invitedUserId) {
        this.invitedUserId = invitedUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvitationEntity that = (InvitationEntity) o;

        if (groupId != that.groupId) return false;
        if (id != that.id) return false;
        if (invitedUserId != that.invitedUserId) return false;
        if (invitingUserId != that.invitingUserId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + groupId;
        result = 31 * result + invitingUserId;
        result = 31 * result + invitedUserId;
        return result;
    }
}
