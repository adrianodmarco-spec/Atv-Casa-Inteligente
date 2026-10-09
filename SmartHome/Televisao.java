public class Televisao implements IDispositivoIoT {

    @Override
    public void ligar() {
        System.out.println("Televisão ligada!");
    }

    public void desligar() {
        System.out.println("Televisão desligada!");
    }
}