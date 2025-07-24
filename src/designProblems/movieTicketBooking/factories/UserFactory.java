package designProblems.movieTicketBooking.factories;

import designProblems.movieTicketBooking.User;

public class UserFactory {
    User createFactory(String name,String userId, int money){
        return new User(name,userId,money);
    }
}
