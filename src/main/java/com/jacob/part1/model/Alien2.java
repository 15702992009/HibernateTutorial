package com.jacob.part1.model;

import javax.persistence.*;

@Entity
@Table(name = "alien_table2")
public class Alien2 {

    @Id
    private int aid;
    private AlienName aname;
    private String color;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public AlienName getAname() {
        return aname;
    }

    public void setAname(AlienName aname) {
        this.aname = aname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien2{" +
                "aid=" + aid +
                ", aname=" + aname +
                ", color='" + color + '\'' +
                '}';
    }
}
