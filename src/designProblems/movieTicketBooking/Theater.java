package designProblems.movieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    List<Screen> screens=new ArrayList<>();
    void addScreen(Screen screen){
        screens.add(screen);
    }
}
