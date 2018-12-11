package nl.saxion.mbi12.examples.oop1819.week4.homeautomation.model;

public class PhilipsHUELightbulb extends DimmableLightbulb {
    private int[] colorValues;

    public PhilipsHUELightbulb() {
        super();
        colorValues = new int[3];
        colorValues[0] = colorValues[1] = colorValues[2] = 255;
    }

    /**
     * Set the color of this HUE bulb to a color specified as red/green/blue combination
     * @param red Value for red component of light (value in range 0-255)
     * @param green Value for green component of light (value in range 0-255)
     * @param blue Value for blue component of light (value in range 0-255)
     */
    public void setColor(int red, int green, int blue) {
        if (red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255) {
            colorValues[0] = red;
            colorValues[1] = green;
            colorValues[2] = blue;
        } else
            System.err.println("Invalid color values (" + red + ", " + green + ", " + blue + ")");
    }
}
