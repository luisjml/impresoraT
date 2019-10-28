/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorat;

/*obtiene un estado (booleano) de encendido o apagado */
public class PausarImpresionCommand implements Command {

   private Impresora printer;

   public PausarImpresionCommand(Impresora impresora) {
        this.printer=impresora;
   }

   public void execute() {
      printer.pausarImpresion();
   }
}