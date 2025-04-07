import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Livro> bibliotecaVirtual = new LinkedList<>();
        GrafoIndicacao indicacaoLivro = new GrafoIndicacao();
        Livro livro1 = new Livro("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin",2008,indicacaoLivro);
        Livro livro2 = new Livro("The Pragmatic Programmer: Your Journey to Mastery","Andrew Hunt e David Thomas",1999,indicacaoLivro);
        Livro livro3 = new Livro("Introduction to Algorithms","Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest e Clifford Stein",2009,indicacaoLivro);
        Livro livro4 = new Livro("O Senhor dos Anéis: A Sociedade do Anel"," J.R.R. Tolkien",1954,indicacaoLivro);
        Livro livro5 = new Livro("Harry Potter e a Pedra Filosofal"," J.K. Rowling",1997,indicacaoLivro);
        Livro livro6 = new Livro("Mistborn: O Império das Torres","Brandon Sanderson",2006,indicacaoLivro);
        Livro livro7 = new Livro("Orgulho e Preconceito","Jane Austen", 1813,indicacaoLivro);
        Livro livro8 = new Livro("A Culpa é das Estrelas","John Green",2012,indicacaoLivro);
        Livro livro9 = new Livro("O Grande Gatsby","F. Scott Fitzgerald",1925,indicacaoLivro);
        Livro livro10 = new Livro("One Piece"," Eiichiro Oda",1997,indicacaoLivro);
        Livro livro11 = new Livro("Naruto"," Masashi Kishimoto", 1999,indicacaoLivro);
        Livro livro12 = new Livro("Attack on Titan (Shingeki no Kyojin)","Hajime Isayama",2009,indicacaoLivro);




        bibliotecaVirtual.add(livro1);
        bibliotecaVirtual.add(livro2);
        bibliotecaVirtual.add(livro3);
        bibliotecaVirtual.add(livro4);
        bibliotecaVirtual.add(livro5);
        bibliotecaVirtual.add(livro6);
        bibliotecaVirtual.add(livro7);
        bibliotecaVirtual.add(livro8);
        bibliotecaVirtual.add(livro9);
        bibliotecaVirtual.add(livro10);
        bibliotecaVirtual.add(livro11);
        bibliotecaVirtual.add(livro12);

        Leitor leitor1 = new Leitor("joao");
        Leitor leitor2 = new Leitor("tadeu");
        Leitor leitor3 = new Leitor("maria");
        Leitor leitor4 = new Leitor("miguel");


        indicacaoLivro.adicionarLigacao(livro1,livro2);
        indicacaoLivro.adicionarLigacao(livro1,livro3);
        indicacaoLivro.adicionarLigacao(livro2,livro1);
        indicacaoLivro.adicionarLigacao(livro2,livro3);
        indicacaoLivro.adicionarLigacao(livro3,livro1);
        indicacaoLivro.adicionarLigacao(livro3,livro2);

        indicacaoLivro.adicionarLigacao(livro4,livro5);
        indicacaoLivro.adicionarLigacao(livro4,livro6);
        indicacaoLivro.adicionarLigacao(livro5,livro4);
        indicacaoLivro.adicionarLigacao(livro5,livro6);
        indicacaoLivro.adicionarLigacao(livro6,livro4);
        indicacaoLivro.adicionarLigacao(livro6,livro5);

        indicacaoLivro.adicionarLigacao(livro7,livro8);
        indicacaoLivro.adicionarLigacao(livro7,livro9);
        indicacaoLivro.adicionarLigacao(livro8,livro7);
        indicacaoLivro.adicionarLigacao(livro8,livro9);
        indicacaoLivro.adicionarLigacao(livro9,livro7);
        indicacaoLivro.adicionarLigacao(livro9,livro8);

        indicacaoLivro.adicionarLigacao(livro10,livro11);
        indicacaoLivro.adicionarLigacao(livro10,livro12);
        indicacaoLivro.adicionarLigacao(livro11,livro10);
        indicacaoLivro.adicionarLigacao(livro11,livro12);
        indicacaoLivro.adicionarLigacao(livro12,livro10);
        indicacaoLivro.adicionarLigacao(livro12,livro11);










    }
}