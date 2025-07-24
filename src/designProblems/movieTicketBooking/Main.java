package designProblems.movieTicketBooking;

public class Main {
    public static void main(String[] args) {
        Application application=new Application();
//        Movie
        Movie movie=new Movie("Avengers");
        application.addMovie(movie);


        Theater theater=new Theater();
        Screen screen1=new Screen();
        theater.addScreen(screen1);
        int ticketPrice=200;
        Show show=new Show(movie,ticketPrice,10,50);

        screen1.addShow(show);

        User rituraj=new User("Rituraj","UserId", 1000);
        application.registerUser(rituraj);
        rituraj.buyTicket(show,3);


    }
}
