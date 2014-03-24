/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author relango
 */
/* The Invoker class */
public class Switch {
   private List<Command> history = new ArrayList<>();
 
   public Switch() {
   }
 
   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();        
   }

    public List<Command> getHistory() {
        return history;
    }
}
