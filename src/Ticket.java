abstract class Ticket {
    private final int ticketId;
    private final int customerId;


    public Ticket(int ticketId, int customerId) {
        this.ticketId = ticketId;
        this.customerId = customerId;
    }


    public abstract double getPrice();


    public int getTicketId() {
        return ticketId;
    }

    public int getCustomerId() {
        return customerId;
    }
}






