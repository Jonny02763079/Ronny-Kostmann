package remoteControll;

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

    public List<Battery> getBatteries() {
        return batteries;
    }
}
