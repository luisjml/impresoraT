/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorat;

public class ObtenerTrabajoParaImprimirCommand implements Command {

   private Impresora printer;

   public ObtenerTrabajoParaImprimirCommand(Impresora impresora) {
        this.printer=impresora;
   }

   public void execute() {
      printer.trabajoAImprimir();
   }
}
