package com.jacob.part2_relationship.manyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    private int lid;
    private String lname;
    @ManyToMany(cascade = {
            CascadeType.ALL
    })
    @JoinTable(
            name = "laptop_student",
            joinColumns = @JoinColumn(name = "laptop_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
