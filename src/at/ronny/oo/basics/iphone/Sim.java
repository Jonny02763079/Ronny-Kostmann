package at.ronny.oo.basics.iphone;

public class Sim {
    private int id;
    private String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String doCall(String number){
        System.out.println("Die nummer " + number + " wird angerufen mit der Sim mit der ID " + this.id);
        return number;
    }
}
