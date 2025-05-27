import java.time.LocalDate;

public class Emprestimo {
    Livro livro;
    Pessoa pessoa;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa, int dias) {
        if (livro.verDisponibilidade()) {
            this.livro = livro;
            this.pessoa = pessoa;
            this.dataEmprestimo = dataEmprestimo.now();
            this.dataDevolucao = dataEmprestimo.plusDays(dias);
            livro.emprestar();
            System.out.println("Livro emprestado para " + pessoa.getNome() + " até " + dataDevolucao);
        }
        else {
            System.out.println("O liveo não está disponível para empréstimo");
        }
    }

    public void finalizarEmprestimo(){
        livro.devolver();
        System.out.println("Livro devolvido por: "+ pessoa.getNome());
    }
}
