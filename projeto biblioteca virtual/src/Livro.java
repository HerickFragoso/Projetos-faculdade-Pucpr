public class Livro {
    public String titulo;
    public String autor;
    public int anoLancamento;
    public boolean disponivel;
    public FilaEspera filaEsperaLivro;

    public Livro(String titulo, String autor, int anoLancamento){
        this.titulo=titulo;
        this.autor=autor;
        this.anoLancamento=anoLancamento;
        this.disponivel = true;
        this.filaEsperaLivro = new FilaEspera();
    }

    public void mostrarLivro(){
        System.out.println("titulo:"+titulo+" | "+"Autor:"+autor+" | "+"Ano lançamento:"+ anoLancamento);
    }

    public void mostrarFilaEspera(){
        filaEsperaLivro.mostrarFila();

    }

}
