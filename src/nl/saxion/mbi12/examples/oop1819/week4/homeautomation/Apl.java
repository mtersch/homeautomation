package nl.saxion.mbi12.examples.oop1819.week4.homeautomation;

import nl.saxion.mbi12.examples.oop1819.week4.homeautomation.model.*;

/**
 * Home Automation Application
 * @author Martijn ter Schegget - Saxion Hogescholen
 * @version 1.0
 */
public class Apl {
    public static void main(String[] args) {
        //Create lights
        Lightbulb readinglamp = new Lightbulb();
        DimmableLightbulb pendant = new DimmableLightbulb();
        PhilipsHUELightbulb huebulb = new PhilipsHUELightbulb();

        //Print the properties of the lights
        System.out.println("Reading lamp      : " + readinglamp);
        System.out.println("Pendant           : " + pendant);
        System.out.println("Philips HUE lamp  : " + huebulb);
        System.out.println("---");

        // Turn reading lamp on
        readinglamp.turnOn();
        System.out.println("Reading lamp      : " + readinglamp);

        //Turn pendant on and set the brightness
        pendant.setBrightness(50);
        pendant.turnOn();
        System.out.println("Pendant           : " + pendant);

        //Turn huebulb on and set brightness to 60% and the color to a red variant
        huebulb.setBrightness(60);
        huebulb.setColor(255, 10, 10);
        huebulb.turnOn();
        System.out.println("Philips HUE lamp  : " + huebulb);
    }
}
