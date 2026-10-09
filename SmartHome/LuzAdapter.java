public class LuzAdapter implements IDispositivoIoT {

    private VelhaLuz luzAntiga;

    public LuzAdapter(VelhaLuz luzAntiga) {
        this.luzAntiga = luzAntiga;
    }

    @Override
    public void ligar() {
        luzAntiga.AcenderLuzAntiga();
    }

    public void desligar() {
    System.out.println("Lâmpada apagada!");
}

}