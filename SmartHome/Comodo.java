import java.util.ArrayList;
import java.util.List;

public class Comodo implements IDispositivoIoT {

    private String nome;
    private List<IDispositivoIoT> dispositivos = new ArrayList<>();

    public Comodo(String nome) {
        this.nome = nome;
    }

    public void adicionar(IDispositivoIoT dispositivo) {
        dispositivos.add(dispositivo);
    }

    @Override
    public void ligar() {
        System.out.println("Ativando cômodo: " + nome);

        for (IDispositivoIoT dispositivo : dispositivos) {
            dispositivo.ligar();
        }
    }
public void desligarLuzes() {
    for (IDispositivoIoT dispositivo : dispositivos) {
        if (dispositivo instanceof LuzAdapter) {
            ((LuzAdapter) dispositivo).desligar();
        } else if (dispositivo instanceof Comodo) {
            ((Comodo) dispositivo).desligarLuzes();
        }
    }
}

}