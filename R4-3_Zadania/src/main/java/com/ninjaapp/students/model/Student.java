package com.ninjaapp.students.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author: Daniel
 */
@Entity
@Table (name = "students")
public class Student {
    @Id
    private long id;

    private String imie;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
