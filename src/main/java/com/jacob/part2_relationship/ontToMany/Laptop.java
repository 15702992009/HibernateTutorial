package com.jacob.part2_relationship.ontToMany;

import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", student=" + student +
                '}';
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
