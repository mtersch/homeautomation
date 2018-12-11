package nl.saxion.mbi12.examples.oop1819.week4.homeautomation.model;

public class DimmableLightbulb extends Lightbulb {
    private int percentage;

    public DimmableLightbulb() {
        super();
        percentage = 0;
    }

    /**
     * Set brightness as a percentage of maximum brightness
     * @param percentage Brightness percentage to set (value in range 0-100)
     */
    public void setBrightness(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        if (isOn) {
            return super.toString() + ", with brightness " + percentage;
        } else {
            return super.toString();
        }
    }
}
