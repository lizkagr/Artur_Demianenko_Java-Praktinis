class VIPTicket extends Ticket {
    private final String movieTitle;
    private final String seatNumber;
    private final String extraBenefits;

    public VIPTicket(int ticketId, int customerId, String movieTitle, String seatNumber, String extraBenefits) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.extraBenefits = extraBenefits;
    }

    @Override
    public double getPrice() {
        return 20.0;
    }

    @Override
    public String toString() {
        return "VIPTicket: " + movieTitle + ", Seat: " + seatNumber + ", Price: $" + getPrice() + ", Benefits: " + extraBenefits;
    }
}

