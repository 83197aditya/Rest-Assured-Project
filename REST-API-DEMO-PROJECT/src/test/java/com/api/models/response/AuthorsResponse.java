package com.api.models.response;

public class AuthorsResponse {
    private int id;
    private int idBook;
    private String firstName;
    private String lastName;

    public AuthorsResponse() {
    }
    public AuthorsResponse(int id, int idBook, String firstName, String lastName) {
        this.id = id;
        this.idBook = idBook;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }   
    public void setId(int id) {
        this.id = id;
    }
    public int getIdBook() {
        return idBook;
    }
    public void setIdBook(int idBook) {
        this.idBook = idBook;
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
        return "AuthorsResponse [id=" + id + ", idBook=" + idBook + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
