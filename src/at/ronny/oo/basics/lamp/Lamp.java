package at.ronny.oo.basics.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private double overAllUsage;
    private List<GlowElements> glowElementslist;

    public Lamp() {
        this.glowElementslist = new ArrayList<>();
    }

    public void addGlowElements(GlowElements glowElements){
        this.glowElementslist.add(glowElements);
    }
    public void turnAllOn(){
        for (int i = 0; i < glowElementslist.size(); i++) {
            glowElementslist.get(i).setOn(false);
            glowElementslist.get(i).turnOn();
        }
    }
    public void getOverallPowerUsage(){
        for (int i = 0; i < glowElementslist.size(); i++) {
            overAllUsage += getGlowElementslist().get(i).getAmpereconsumption();
        }
        System.out.println("Die Summe aller Verbraucher ist " + overAllUsage);
    }
    public void printNamesOfLightElements(){
        System.out.println("Die Namen aller Elemente sind: ");
        for (int i = 0; i < glowElementslist.size(); i++) {
            System.out.println(glowElementslist.get(i).getName());
        }
    }

    public List<GlowElements> getGlowElementslist() {
        return glowElementslist;
    }

    public void setGlowElementslist(List<GlowElements> glowElementslist) {
        this.glowElementslist = glowElementslist;
    }
}
