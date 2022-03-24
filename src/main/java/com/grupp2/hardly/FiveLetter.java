package com.grupp2.hardly;

import javax.persistence.*;

@Entity
@Table(name = "fiveletter")
public class FiveLetters {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "word")
    private String data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FiveLetters() {

    }
    public FiveLetters(String s){
        data = s;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
