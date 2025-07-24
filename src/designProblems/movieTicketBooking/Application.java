package designProblems.movieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Application {
    List<Movie> movies=new ArrayList<>();
    List<Theater> theaters=new ArrayList<>();
    List<User> users=new ArrayList<>();
    void addMovie(Movie movie){
        movies.add(movie);
    }
    void addTheater(Theater theater){
        theaters.add(theater);
    }
    void registerUser(User user){
        users.add(user);
    }
}
