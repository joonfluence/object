package object._01_ticket;

public class Ticket {
    private Long fee;

    public Ticket() {
    }

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }
}
