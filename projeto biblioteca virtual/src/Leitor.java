import java.util.LinkedList;

public class Leitor {
    String nome;
    Livro emprestimo;
    Livro livroDesejado;
    PilhaHistorico historico;

    public Leitor(String nome){
        this.nome = nome;
        this.historico = new PilhaHistorico();

    }

    public void mostrarLeitor(){
        if(emprestimo != null && livroDesejado != null ) {
            System.out.println("nome:"+nome+" | "+"livro emprestado:"+emprestimo.titulo+" | "+"livro desejado:"+livroDesejado.titulo);
        } else if (emprestimo != null && livroDesejado == null ) {
            System.out.println("nome:"+nome+" | "+"livro emprestado:"+emprestimo.titulo);
        }else{
            System.out.println("nome:"+nome);
        }
    }

    public void mostrarHistoricoEmprestimo(){
        if(historico.historicoEmprestimo != null){
            historico.mostrarPilhaEmprestimo(this);
        }else{
            System.out.println("seu historico esta vazio");
        }


    }

    public void mostrarHistoricoVisualizacao(){
        if(historico.historicoVizualizacao != null){
            historico.mostrarPilhaVisualizacao(this);
        }else{
            System.out.println("seu historico esta vazio");
        }


    }

    public String emprestarLivro(LinkedList<Livro> biblioteca, String tituloLivro){
        if(this.emprestimo != null){
            System.out.println("vc ja esta com este livro: "+"'"+this.emprestimo.titulo+"'"+" emprestado");
            return "vc ja esta com um livro";
        }else {

            for (Livro livro : biblioteca) {
                if (tituloLivro.equals(livro.titulo) && livro.disponivel == true) {
                    livro.disponivel = false;
                    emprestimo = livro;
                    historico.adicionarNoHistoricoEmprestimo(livro);
                    System.out.println("Emprestimo livro: " + livro.titulo + " concluido");
                    return "emprestado";

                } else if (tituloLivro.equals(livro.titulo) && livro.disponivel == false) {
                    livroDesejado = livro;
                    livro.filaEsperaLivro.adicionarFilaEspera(this);
                    System.out.println("livro indisponivel para imprestimo");
                    System.out.println("leitor " + this.nome + " foi adicionado a lista de espera");
                    return "indisponivel";

                }
            }
            return "inexistente";
        }
    }

    public void visualizarLivro(Livro livro){
        System.out.println(this.nome + " esta visualizando livro:");
        livro.mostrarLivro();
        historico.adicionarNoHistoricoVisualizacao(livro);
    }
}
