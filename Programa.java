import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Livro[] livros = new Livro[]{
            new Livro(0,"Memórias póstumas de brás cubas", "Machado de Assis", true),
            new Livro(1,"E não sobrou nenhum", "Aghata Christie", true),
        };
        
        Pessoa[] pessoas = new Pessoa[]{
            new Pessoa("Albert"),
        };
        System.out.println("Digite seu nome: ");
        Pessoa currPessoa = new Pessoa(sc.nextLine());
        
        Emprestimo[] emprestimos = new Emprestimo[]{
            new Emprestimo(livros[0], pessoas[0], 10),
        };
        
        System.out.println("Lista de Livros: ");

        for (Livro livro : livros){
            System.out.println("Id: "+ livro.id + " | Nome " + livro.nome + " | Autor" + livro.autor + " | " + livro.getDisponibilidade());
        };

        System.out.println("Digite o id do livro");
        Livro currLivro = livros[Integer.parseInt(sc.nextLine())];


        Emprestimo novoEmprestimo = new Emprestimo(currLivro, currPessoa, 20);
        sc.close();
    }
}
