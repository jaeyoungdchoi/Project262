package jc56.cs262.calvin.edu.caluberprototype;

public class Rides {

    String driver;
    String departure;
    String destination;
    int passengers;
    String dateAndTime;



    public Rides(String departure, String destination, int passengers, String dateAndTime) {
        this.departure = departure;
        this.destination = destination;
        this.passengers = passengers;
        this.dateAndTime = dateAndTime;
    }

    public Rides(String driver, String  departure, String destination,
                 int passengers, String dateAndTime) {
        this.driver = driver;
        this.departure = departure;
        this.destination = destination;
        this.passengers = passengers;
        this.dateAndTime = dateAndTime;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
