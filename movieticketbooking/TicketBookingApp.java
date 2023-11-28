// File: movieticketbooking/TicketBookingApp.java
package movieticketbooking;

public class TicketBookingApp {
    public static void main(String[] args) {
        MovieTheater movieTheater = new MovieTheater();
        movieTheater.displayDetails();
        movieTheater.bookTicket();
    }
}
