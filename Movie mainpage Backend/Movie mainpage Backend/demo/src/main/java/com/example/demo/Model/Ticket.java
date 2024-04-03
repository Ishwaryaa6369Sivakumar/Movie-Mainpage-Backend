package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    private int TicketId;
    private String MovieName;
    private String Categories;
    private double Amount;
    private String NumberOfSeats;
    private String ConfirmBooking;
    public int getTicketId() {
        return TicketId;
    }
    public void setTicketId(int ticketId) {
        TicketId = ticketId;
    }
    public String getMovieName() {
        return MovieName;
    }
    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
    public String getCategories() {
        return Categories;
    }
    public void setCategories(String categories) {
        Categories = categories;
    }
    public double getAmount() {
        return Amount;
    }
    public void setAmount(double amount) {
        Amount = amount;
    }
    public String getNumberOfSeats() {
        return NumberOfSeats;
    }
    public void setNumberOfSeats(String numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }
    public String getConfirmBooking() {
        return ConfirmBooking;
    }
    public void setConfirmBooking(String confirmBooking) {
        ConfirmBooking = confirmBooking;
    }
    public Ticket(int ticketId, String movieName, String categories, double amount, String numberOfSeats,
            String confirmBooking) {
        TicketId = ticketId;
        MovieName = movieName;
        Categories = categories;
        Amount = amount;
        NumberOfSeats = numberOfSeats;
        ConfirmBooking = confirmBooking;
    }
    public Ticket() {
    }
    
   
    
}