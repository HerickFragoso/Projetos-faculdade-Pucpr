public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String titulo,String autor,int anoPublicacao){
        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicacao=anoPublicacao;
    }
    public void mostrarLivro(){
        System.out.println("titulo livro: "+titulo+"|"+" autor: "+autor+"|"+" ano publicação: "+anoPublicacao);
    }
}
