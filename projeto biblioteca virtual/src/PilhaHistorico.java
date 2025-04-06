import java.util.Stack;

public class PilhaHistorico {
    Stack<Livro> historicoEmprestimo;
    Stack<Livro> historicoVizualizacao;


    public PilhaHistorico(){
        this.historicoEmprestimo = new Stack<Livro>();
        this.historicoVizualizacao = new Stack<Livro>();
    }

    public void adicionarNoHistoricoEmprestimo(Livro livro){
        historicoEmprestimo.add(livro);
    }

    public void adicionarNoHistoricoVisualizacao(Livro livro){
        historicoVizualizacao.add(livro);
    }

    public void mostrarPilhaEmprestimo(Leitor leitor){
        int contador = 1;
        for(Livro livro: historicoEmprestimo){
            System.out.println(contador+" livro emprestado do leitor "+leitor.nome+":"+livro.titulo);
            contador++;
        }
    }

    public void mostrarPilhaVisualizacao(Leitor leitor){
        int contador = 1;
        for(Livro livro: historicoVizualizacao){
            System.out.println(contador+" livro vizualizado do Leitor "+leitor.nome+":"+livro.titulo);
            contador++;
        }
    }
}
