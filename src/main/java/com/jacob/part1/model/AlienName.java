package com.jacob.part1.model;

import javax.persistence.Embeddable;

/**
 * todo : why not @Id
 */
@Embeddable
public class AlienName {
    String fname;
    String lname;
    String mname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    @Override
    public String toString() {
        return "AlienName{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
