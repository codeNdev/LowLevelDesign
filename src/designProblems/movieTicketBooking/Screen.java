package designProblems.movieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    List<Show> shows=new ArrayList<>();
    void addShow(Show show){
        shows.add(show);
    }
    void removeShows(Show show){
        shows.remove(show);

    }
}
