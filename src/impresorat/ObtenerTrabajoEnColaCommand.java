/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorat;

/* obtiene cantidad de trabajos (numero entero positivo) encolados que deben ser impresos  */
public class ObtenerTrabajoEnColaCommand implements Command {

   private Impresora printer;

   public  ObtenerTrabajoEnColaCommand(Impresora impresora) {
        this.printer=impresora;
   }

   public void execute(){
      printer.trabajosEnCola();
   }
}
