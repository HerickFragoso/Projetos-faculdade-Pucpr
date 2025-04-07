import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GrafoIndicacao {
    HashMap<Livro, Set<Livro>> ligarLivros;

    public GrafoIndicacao(){
        this.ligarLivros = new HashMap<>();
    }

    public void adicionarLivroGrafo(Livro livro){
        this.ligarLivros.putIfAbsent(livro,new HashSet<>());
    }

    public void adicionarLigacao(Livro livro1,Livro livro2){
        this.ligarLivros.putIfAbsent(livro1,new HashSet<>());
        this.ligarLivros.putIfAbsent(livro2,new HashSet<>());
        this.ligarLivros.get(livro1).add(livro2);
        this.ligarLivros.get(livro2).add(livro1);
    }

    public void mostrarIndicacao(Livro livro){
        for(Livro livro1 : this.ligarLivros.get(livro)){
            System.out.println(livro1.titulo);
        }
    }

    public void mostrarLivrosChave(){
        for(Livro livro : this.ligarLivros.keySet()){
            livro.mostrarLivro();
            System.out.println();

        }
    }

}
