package at.ronny.oo.basics.iphone;

public class Phone {
    private String color;
    private Sim sim;
    private SDCard sdCard;
    private Camera camera;

    public Phone(String color, Sim sim, SDCard sdCard, Camera camera) {
        this.color = color;
        this.sim = sim;
        this.sdCard = sdCard;
        this.camera = camera;
    }

    public Sim getSim() {
        return sim;
    }

    public String makeCall(String number){
        this.sim.doCall(number);
        return number;
    }

    public void takePicure(Camera.resolution size, Camera.extension type ) {
        if (this.sdCard.getCapacity() >= 1000) {
            PhotoFile file = this.camera.makePhoto(size, type);
            this.sdCard.saveFile(file);
            this.sdCard.setActualCapacity(this.sdCard.getCapacity() - this.camera.getFileSize());
        } else {
            System.out.println("Es ist zu wenig Speicherplatz verfügbar");
        };
    }

    public void printAllFiles(){
        sdCard.gettInfo();
    }

    public void getFreeSpace(){
        this.sdCard.getFreeSpace();
    }
}
