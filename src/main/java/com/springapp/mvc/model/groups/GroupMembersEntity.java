package com.springapp.mvc.model.groups;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by tabbasi on 06/10/14.
 */
@Entity
@Table(name = "GroupMembers", schema = "", catalog = "mydb")
public class GroupMembersEntity {
    private int id;
    private int groupId;
    private int memberId;
    private byte isAdmin;
    private Timestamp joinDate;

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
    @Column(name = "MemberID")
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "isAdmin")
    public byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Basic
    @Column(name = "JoinDate")
    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupMembersEntity that = (GroupMembersEntity) o;

        if (groupId != that.groupId) return false;
        if (id != that.id) return false;
        if (isAdmin != that.isAdmin) return false;
        if (memberId != that.memberId) return false;
        if (joinDate != null ? !joinDate.equals(that.joinDate) : that.joinDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + groupId;
        result = 31 * result + memberId;
        result = 31 * result + (int) isAdmin;
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        return result;
    }
}
