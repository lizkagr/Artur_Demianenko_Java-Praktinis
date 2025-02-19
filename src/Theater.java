import java.util.*;

class Theater {
    private final Map<Integer, Customer> customers;
    private final Map<String, MovieScreening> movieScreenings;
    private final List<Ticket> ticketsSold;

    public Theater() {
        customers = new HashMap<>();
        movieScreenings = new HashMap<>();
        ticketsSold = new ArrayList<>();
    }

    public void addCustomer(int id, String name, int age) {
        customers.put(id, new Customer(id, name, age));
    }

    public void sellTicket(Ticket ticket) {
        ticketsSold.add(ticket);
    }

    public void addMovieScreening(String movieTitle, String screeningTime) {
        movieScreenings.put(movieTitle, new MovieScreening(movieTitle, screeningTime));
    }

    public void enrollCustomerInScreening(int customerId, String movieTitle) {
        Customer customer = customers.get(customerId);
        MovieScreening screening = movieScreenings.get(movieTitle);

        if (customer == null) {
            System.out.println("Customer ID not found.");
            return;
        }
        if (screening == null) {
            System.out.println("Movie screening not found.");
            return;
        }

        screening.addAttendee(customer);
    }

    public void printCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    public void printTickets() {
        System.out.println("Tickets:");
        for (Ticket ticket : ticketsSold) {
            System.out.println(ticket);
        }
    }

    public void printScreenings() {
        System.out.println("Movie Screenings:");
        for (MovieScreening screening : movieScreenings.values()) {
            System.out.println(screening);
        }
    }
}

