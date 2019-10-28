package impresorat;

/*  Invoker  */
public class ColaImpresion {

    private Command obtenerTrabajoEnColaCommand;
    private Command pausarImpresionCommand;
    private Command estaImprimiendoCommand;
    private Command obtenerTrabajoParaImprimirCommand;

    public ColaImpresion(Command obtenerTrabajoEnCola,Command pausarImpresion, Command estaImprimiendo, Command obtenerTrabajoParaImprimir) {
         this.obtenerTrabajoEnColaCommand = obtenerTrabajoEnCola ;
         this.pausarImpresionCommand = pausarImpresion;
         this.estaImprimiendoCommand = estaImprimiendo;
         this.obtenerTrabajoParaImprimirCommand = obtenerTrabajoParaImprimir;
    }

    public void obtenerTrabajoEnCola() {
         obtenerTrabajoEnColaCommand.execute();
    }

    public void pausarImpresion() {
         pausarImpresionCommand.execute();
    }

    public void estaImprimiendo() {
         estaImprimiendoCommand.execute();
    }

    public void obtenerTrabajoParaImprimir() {
         obtenerTrabajoParaImprimirCommand.execute();
    }
}