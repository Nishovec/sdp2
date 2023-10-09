    public class TicketOrderingSystem {
        public static void main(String[] args) {
            Ticket basicTicket = new BasicTicket("Concert Ticket", 100.0);


            Ticket vipTicket = new VipTicketDecorator(basicTicket);
            Ticket vipTicketWithRefreshments = new RefreshmentsTicketDecorator(vipTicket);


            System.out.println("Basic Ticket: " + basicTicket.getDescription() + ", Price: $" + basicTicket.getPrice());
            System.out.println("VIP Ticket: " + vipTicket.getDescription() + ", Price: $" + vipTicket.getPrice());
            System.out.println("VIP Ticket with Refreshments: " + vipTicketWithRefreshments.getDescription() + ", Price: $" + vipTicketWithRefreshments.getPrice());
        }
    }


