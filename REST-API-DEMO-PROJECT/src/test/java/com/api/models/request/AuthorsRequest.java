package com.api.models.request;

public class AuthorsRequest {
    private int id;
    private int idbook;
    private String firstName;
    private String lastName;

    public AuthorsRequest() {
    }

    public AuthorsRequest(int id, int idbook, String firstName, String lastName) {
        this.id = id;
        this.idbook = idbook;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdbook() {
        return idbook;
    }
    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "AuthorsRequest [id=" + id + ", idbook=" + idbook + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
