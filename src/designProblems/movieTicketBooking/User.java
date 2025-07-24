package designProblems.movieTicketBooking;

import javax.swing.plaf.IconUIResource;

public class User {
    String name;
    String userId;
    int money;
    public User(String name, String userId,int money){
        this.name=name;
        this.userId=userId;
        this.money=money;
    }
    boolean buyTicket(Show show,int count){
        return show.buyTicket(this, count);
    }
}
