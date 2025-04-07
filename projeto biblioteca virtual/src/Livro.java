public class Livro {
    public String titulo;
    public String autor;
    public int anoLancamento;
    public boolean disponivel;
    public FilaEspera filaEsperaLivro;


    public Livro(String titulo, String autor, int anoLancamento,GrafoIndicacao indicacaoLivro){
        this.titulo=titulo;
        this.autor=autor;
        this.anoLancamento=anoLancamento;
        this.disponivel = true;
        this.filaEsperaLivro = new FilaEspera();
        indicacaoLivro.adicionarLivroGrafo(this);
    }

    public void mostrarLivro(){
        System.out.print("titulo:"+titulo+" | "+"Autor:"+autor+" | "+"Ano lançamento:"+ anoLancamento);
    }

    public void mostrarFilaEspera(){
        filaEsperaLivro.mostrarFila();

    }



}
