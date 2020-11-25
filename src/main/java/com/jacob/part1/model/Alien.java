package com.jacob.part1.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * @Entity is differ to @Table
 */

/**
 * @Transient Specifies that the property or field is not persistent. It is used
 * to annotate a property or field of an entity class, mapped
 * superclass, or embeddable class.
 */
@Entity()
//@Table(name = "alien_table")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien { //POJO

    @Id
    @Column(name = "id")
    private int aid;

    @Column(name = "name")
    private String aname;

    @Column(name = "color")
    private String color;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
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
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
