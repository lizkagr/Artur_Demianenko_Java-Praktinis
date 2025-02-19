public class MainScreenTest {
    public static void main(String[] args) {

        MovieScreening screening = new MovieScreening("Titanic", "Saturday 7PM");
        System.out.println(screening);

        screening.addAttendee(new Customer(301, "Daniel", 34));
        System.out.println(screening);

        screening.addAttendee(new Customer(302, "Sophia", 29));
        System.out.println(screening);

        MovieScreening anotherScreening = new MovieScreening("Interstellar", "Sunday 5PM");
        anotherScreening.addAttendee(new Customer(303, "Lucas", 42));

        System.out.println(anotherScreening);
    }
}

