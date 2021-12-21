package com.example.newcostumerpro.costumerP;

import javax.persistence.*;

@Entity
@Table(name = "NewCostumer")
public class TableContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String value;
    @Column
    private String type;
    @Column
    private String description;

    public TableContent(String s, String s1, String new_type, String aciklama_yok) {

    }

    public TableContent(Long id, String name, String value, String type, String description) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.type = type;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
