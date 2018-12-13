package topic.StaticVariable;

public class Ticket {
    private String event;
    private Double value;
    private Integer id ;
    static Integer totalTicket = 0;
    Ticket(String name, Double value){
        event =name;
        this.value = value;
        this.id = totalTicket +1;
        this.totalTicket = this.id;
    }

    public String getEvent() {
        return event;
    }

    public Double getValue() {
        return value;
    }

    public Integer getId() {
        return id;
    }
}
