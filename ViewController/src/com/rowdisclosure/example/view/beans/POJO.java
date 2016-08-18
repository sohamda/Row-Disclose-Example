package com.rowdisclosure.example.view.beans;

import java.util.ArrayList;
import java.util.List;


public class POJO {
    
    private long id;
    private String name;
    private String surname;
    
    private List<SubPOJO> addresses = new ArrayList<>();
    
    public POJO(long id, String name, String surname) {
        setId(id);
        setName(name);
        setSurname(surname);
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAddresses(List<SubPOJO> addresses) {
        this.addresses = addresses;
    }

    public List<SubPOJO> getAddresses() {
        return addresses;
    }
    
    public void addAddress(SubPOJO subPojo) {
        getAddresses().add(subPojo);
    }
}
