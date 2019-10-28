/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorat;

/*permite conocer si se esta imprimiendo un trabajo, que anteriormente haya estado encolado.*/
public class EstaImprimiendoCommand implements Command {

   private Impresora printer;

   public  EstaImprimiendoCommand(Impresora impresora) {
        this.printer=impresora;
   }

   public void execute() {
      printer.estaImprimiendo();
   }
}