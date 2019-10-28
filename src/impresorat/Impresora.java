/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorat;

/*  Receiver */
public class Impresora {

     int cola;
     boolean pausada;
     boolean estaImprimiendoAhora;
     int impresionActual;
     public Impresora() {  }


     public void imprimir() {
        System.out.println("Imprimiendo");
     }

     public void trabajosEnCola() {
        System.out.println("en cola hay" + cola + " archivos");
     }

     public void pausarImpresion() {
        this.pausada = true;
        System.out.println("Impresion pausada");
     }

     public void estaImprimiendo() {
        if (estaImprimiendoAhora==true){
            System.out.println("Estoy Imprmimiendo");
                    }
          else {
            System.out.println("No estoy imprimiendo");
                    }
     }

     public void trabajoAImprimir() {
        System.out.println("Se esta imprimiendo el archivo numero"+impresionActual);
     }
}