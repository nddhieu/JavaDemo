package topic.StaticVariable;

/**
 * static data is data of class, all instance object of the same class share the exact same value of static data
 * instance variable (ticket1, ticket 2) can access static data (totalTicket)
 * static object cannot access instance object
 */
public class StaticDemo {
    public static void main (String[] args){
        Ticket ticket1 = new Ticket("Foot ball", (double) 15);
        Ticket ticket2 = new Ticket("Soccer", (double) 20);
        System.out.println(" ticket " + ticket1.getId() + " name and value" + ticket1.getEvent() + " "+ ticket1.getValue());
        System.out.println(" ticket " + ticket2.getId() + " name and value" + ticket2.getEvent() + " "+ ticket2.getValue());
        System.out.println("total number of ticket get from class Ticket " + Ticket.totalTicket);
        System.out.println("total number of ticket (get from ticket1 object): " + ticket1.totalTicket);
        System.out.println("id of ticket1 cannot be access from class Ticket" );
    }
}
