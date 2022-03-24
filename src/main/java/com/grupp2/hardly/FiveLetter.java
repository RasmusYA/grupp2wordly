package com.grupp2.hardly;

import javax.persistence.*;

@Entity
@Table(name = "fiveletter")
public class FiveLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "word")
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FiveLetter() {

    }
    public FiveLetter(String s){
        data = s;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
