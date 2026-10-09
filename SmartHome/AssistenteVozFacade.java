public class AssistenteVozFacade {

    private Comodo sala;
    private Televisao tv;
    private Persiana persiana;

    public AssistenteVozFacade(
        Comodo sala,
        Televisao tv,
        Persiana persiana
    ) {
        this.sala = sala;
        this.tv = tv;
        this.persiana = persiana;
    }

    public void ativarModoCinema() {
    System.out.println("Ativando Modo Cinema...");

    sala.desligarLuzes();

    tv.ligar();
    persiana.abaixar();

    System.out.println("Modo Cinema ativado!");
    }
}