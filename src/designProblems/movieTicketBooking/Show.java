package designProblems.movieTicketBooking;

import java.sql.Timestamp;
import java.util.List;

public class Show {
    int startTime;
    int endTime;
    int ticketPrice;
    Movie movie;
    List<User> watchers;
    public Show(Movie movie, int ticketPrice,int startTime,int endTime){
        this.movie=movie;
        this.ticketPrice=ticketPrice;
        this.startTime=startTime;
        this.endTime=endTime;
    }
    boolean buyTicket(User user,int count){
        if(user.money>=count*ticketPrice){
            user.money-=(count*ticketPrice);
            return true;
        }
        return false;
    }
}
