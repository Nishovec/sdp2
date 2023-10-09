public class VipTicketDecorator implements Ticket {
    private Ticket decoratedTicket;

    public VipTicketDecorator(Ticket ticket) {
        this.decoratedTicket = ticket;
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + " (VIP)";
    }

    @Override
    public double getPrice() {
        return decoratedTicket.getPrice() + 50.0; // VIP upgrade price
    }
}

