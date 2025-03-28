import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList<Livro> bibliotecaVirtual = new LinkedList<>();
        Livro romeuEjulieta = new Livro("romeu e julieta","shakspear",1500);
        bibliotecaVirtual.add(romeuEjulieta);
        for(Livro livro: bibliotecaVirtual){
            livro.mostrarLivro();
        }

    }
}