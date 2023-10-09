public class RefreshmentsTicketDecorator implements Ticket {
    private Ticket decoratedTicket;

    public RefreshmentsTicketDecorator(Ticket ticket) {
        this.decoratedTicket = ticket;
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + " + Refreshments";
    }

    @Override
    public double getPrice() {
        return decoratedTicket.getPrice() + 20.0; // Refreshments cost
    }
}
