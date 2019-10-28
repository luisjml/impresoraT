/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorat;

import java.util.Scanner;

/**
 *
 * @author luis jose
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Impresora impresora = new Impresora();
      Command obtenerTrabajoCola = new ObtenerTrabajoEnColaCommand(impresora);
      Command pausarImpresion = new PausarImpresionCommand(impresora);
      Command estaImprimiendo = new EstaImprimiendoCommand(impresora);
      Command obtenerTrabajoAImprimir = new ObtenerTrabajoParaImprimirCommand(impresora);

      
      ColaImpresion cola = new ColaImpresion(obtenerTrabajoCola,pausarImpresion,estaImprimiendo,obtenerTrabajoAImprimir);

      Scanner sr = new Scanner(System.in);
      System.out.println("opcion 1 a 4");
      String opcion = sr.nextLine();
      
      switch (opcion) {
         case "1":
            cola.obtenerTrabajoEnCola();
            break;
         case "2":
            cola.pausarImpresion();
            break;
          case "3":
            cola.estaImprimiendo();
            break;
          case "4":
            cola.obtenerTrabajoParaImprimir();
            break;
         default:
            System.err.println("argumento valido : 1 , 2 , 3 , 4");
            System.exit(-1);
      }
        // TODO code application logic here
    }
    
}
