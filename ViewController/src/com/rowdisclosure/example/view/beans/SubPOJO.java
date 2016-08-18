package com.rowdisclosure.example.view.beans;


public class SubPOJO {
    
    private String validFrom;
    private String address;
    private String validTo;
    
    public SubPOJO(String validFrom, String validTo, String address) {
        setValidFrom(validFrom);
        setValidTo(validTo);
        setAddress(address);
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getValidTo() {
        return validTo;
    }
}
