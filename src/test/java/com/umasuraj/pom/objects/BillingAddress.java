package com.umasuraj.pom.objects;

public class BillingAddress {

    private String firstName;
    private String lastName;
    private String company;
    private String addressLineOne;
    private String city;
    private String postCode;
    private String email;

    public BillingAddress(){

    }

    public BillingAddress(String firstName, String lastName, String company, String addressLineOne,
                          String city, String postCode, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postCode = postCode;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public BillingAddress setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BillingAddress setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public BillingAddress setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public BillingAddress setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
        return this;
    }

    public String getCity() {
        return city;
    }

    public BillingAddress setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public BillingAddress setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public BillingAddress setEmail(String email) {
        this.email = email;
        return this;
    }


}
