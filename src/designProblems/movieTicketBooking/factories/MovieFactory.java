package designProblems.movieTicketBooking.factories;

import designProblems.movieTicketBooking.Movie;

public class MovieFactory {
    Movie createMovie(String name){
        return new Movie(name);
    }
}
