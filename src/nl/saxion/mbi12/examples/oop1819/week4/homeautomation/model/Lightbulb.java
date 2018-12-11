package nl.saxion.mbi12.examples.oop1819.week4.homeautomation.model;

public class Lightbulb {
    protected boolean isOn;

    public Lightbulb() {
        this.isOn = false;
    }

    /**
     * Turn on the lightbulb (change state from 'off' to 'on'; does nothing if state already is 'on')
     */
    public void turnOn() {
        isOn = true;
    }

    /**
     * Turn off the lightbulb (change state from 'on' to 'off'; does nothing if state already is 'on')
     */
    public void turnOff() {
        isOn = false;
    }

    /**
     * Toggle the lightbulb (change state to 'off' if it is currently 'on', or to 'on' if it is currently 'off')
     */
    public void toggle() {
        if (isOn)
            turnOff();
        else
            turnOn();
    }

    @Override
    public String toString() {
        return isOn ? "on" : "off";
    }
}
