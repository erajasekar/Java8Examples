/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.pattern.command;

/**
 * @author relango
 */
public class PressSwitch {
    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = lamp::turnOn;
        Command switchDown = lamp::turnOff;

        Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(switchUp);
        mySwitch.storeAndExecute(switchDown);
        mySwitch.getHistory().forEach(System.out::println);
    }
}
