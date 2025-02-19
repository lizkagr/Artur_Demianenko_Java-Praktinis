public class TheaterTest {
    public static void main(String[] args) {
        Theater theater = new Theater();

        theater.addCustomer(1, "Alice", 30);
        theater.addCustomer(2, "Bob", 25);
        theater.addCustomer(3, "Jeff", 58);
        theater.printCustomers();
        System.out.println("---\n");

        theater.sellTicket(new RegularTicket(1, 1, "The Matrix", "C5"));
        theater.sellTicket(new VIPTicket(2, 2, "Jurassic Park", "A1", "Free Drinks"));
        theater.sellTicket(new RegularTicket(3, 3, "The Dark Knight", "D8"));
        theater.printTickets();
        System.out.println("---\n");

        theater.addMovieScreening("The Matrix", "Friday 8PM");
        theater.addMovieScreening("Jurassic Park", "Saturday 6PM");

        theater.enrollCustomerInScreening(1, "The Matrix");
        theater.enrollCustomerInScreening(2, "Jurassic Park");
        theater.enrollCustomerInScreening(3, "The Matrix");

        theater.printScreenings();
    }
}
