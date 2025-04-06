import java.util.Queue;
import java.util.LinkedList;

public class FilaEspera {
    Queue<Leitor> filaEspera;

    public FilaEspera(){
        filaEspera = new LinkedList<>();
    }

    public void adicionarFilaEspera(Leitor leitor ){
        filaEspera.add(leitor);
    }

    public void mostrarFila(){
        int contador = 1;
        for(Leitor leitor : filaEspera){
            System.out.print(contador+" na fila para emprestar livro após leitor que esta em posse ");
            leitor.mostrarLeitor();
            System.out.println();
            contador ++;
        }
    }

    public void tirarDaFila(){
        filaEspera.poll();
    }
}
