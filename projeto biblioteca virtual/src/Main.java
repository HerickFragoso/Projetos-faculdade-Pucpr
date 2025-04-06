import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Livro> bibliotecaVirtual = new LinkedList<>();

        Livro livro1 = new Livro("romeu", "cheakspear", 1500);
        bibliotecaVirtual.add(livro1);
        Leitor leitor1 = new Leitor("joao");
        Leitor leitor2 = new Leitor("jorge");
        leitor1.mostrarLeitor();

        leitor1.emprestarLivro(bibliotecaVirtual,"romeu");
        leitor2.emprestarLivro(bibliotecaVirtual,"romeu");
        leitor1.emprestarLivro(bibliotecaVirtual,"romeu");
        leitor1.mostrarHistoricoEmprestimo();
        livro1.mostrarFilaEspera();
        leitor1.visualizarLivro(livro1);
        leitor1.mostrarHistoricoVisualizacao();

    }
}