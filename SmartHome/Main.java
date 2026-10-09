public class Main {

    public static void main(String[] args) {

        // Lâmpada antiga adaptada
        VelhaLuz luzAntiga = new VelhaLuz();
        LuzAdapter luzSala = new LuzAdapter(luzAntiga);

        // Outros dispositivos
        Televisao tv = new Televisao();
        Persiana persiana = new Persiana();

        // Composite: sala com uma lâmpada
        Comodo sala = new Comodo("Sala");
        sala.adicionar(luzSala);

        // Composite: suíte com banheiro
        Comodo suite = new Comodo("Suíte");
        Comodo banheiro = new Comodo("Banheiro");
        suite.adicionar(banheiro);

        // Facade
        AssistenteVozFacade assistente =
            new AssistenteVozFacade(sala, tv, persiana);

        // Testes
        System.out.println("=== TESTE COMPOSITE ===");
        suite.ligar();

        System.out.println("\n=== TESTE ADAPTER ===");
        luzSala.ligar();

        System.out.println("\n=== TESTE FACADE ===");
        assistente.ativarModoCinema();
    }
}