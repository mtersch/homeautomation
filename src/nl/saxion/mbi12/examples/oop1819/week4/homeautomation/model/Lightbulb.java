package nl.saxion.mbi12.examples.oop1819.week4.homeautomation.model;

public class Lightbulb {
    private boolean isOn;

    public Lightbulb() {
        this(false);
    }
    public Lightbulb(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * Turn on the lightbulb (change state from 'off' to 'on'; does nothing if state already is 'on')
     */
    public void turnOn() {
        isOn = true;
    }
}
