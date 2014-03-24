/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.pattern.command;

/**
 *
 * @author relango
 */
/* The Receiver class */
public class Light {
   public Light() {
   }
 
   public void turnOn() {
      System.out.println("The light is on");
   }
 
   public void turnOff() {
      System.out.println("The light is off");
   }
}
