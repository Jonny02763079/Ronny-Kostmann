package at.ronny.oo.basics.remotecontrol;

import java.util.ArrayList;
import java.util.List;

public class remoteControllCase {
    private List<Battery> batteries;
    private int size;
    private int weight;

    public remoteControllCase(int size, int weight) {
        this.size = size;
        this.weight = weight;
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery){
        this.batteries.add(battery);
    }

    public void getStatus(){
        double NewStatus = 0;
        for (int i = 0; i < batteries.size(); i++) {

            NewStatus += batteries.get(i).getAkkuStatus();

        }
        NewStatus/=batteries.size();
        System.out.println("Der neue Akkustatus ist " + NewStatus);
    }

    public void turnOn(){
        double turnOnVoltage = 0;
        for (int i = 0; i < batteries.size(); i++) {
            turnOnVoltage = batteries.get(i).getAkkuStatus() - (0.05 * batteries.get(i).getAkkuStatus());
            System.out.println(turnOnVoltage);
            System.out.println("Verbraucher angeschlossen");
        }
    }

    public void turnOf(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public List<Battery> getBatteries() {
        return batteries;
    }
}
