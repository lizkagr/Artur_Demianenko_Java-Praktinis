import java.util.ArrayList;
import java.util.List;

class MovieScreening {
    private final String movieTitle;
    private final String screeningTime;
    private final List<Customer> attendees;

    public MovieScreening(String movieTitle, String screeningTime) {
        this.movieTitle = movieTitle;
        this.screeningTime = screeningTime;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(Customer customer) {
        attendees.add(customer);
    }

    @Override
    public String toString() {
        String result = movieTitle + " (" + screeningTime + ")";

        if (!attendees.isEmpty()) {
            result += ": " + String.join(", ", attendees.toString().replaceAll("[\\[\\]]", ""));
        }

        return result;
    }
}

