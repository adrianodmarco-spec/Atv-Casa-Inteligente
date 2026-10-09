public class Persiana implements IDispositivoIoT {

    @Override
    public void ligar() {
        System.out.println("Persiana ativada!");
    }

    public void abaixar() {
        System.out.println("Persiana abaixada!");
    }
}