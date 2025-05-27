class Livro {
    int id;
    String nome;
    String autor;
    boolean disponivel;

    public Livro(int id, String nome, String autor, boolean disponivel){
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getDisponibilidade(){
        if (disponivel){
            return "Disponível";
        }
        return "Indisponível";
    }

    public boolean verDisponibilidade(){
        return disponivel;
    }

    public void devolver(){
        disponivel = false;
    }

    public void emprestar(){
        if (disponivel){
            disponivel = false;
        }
        else {
            System.out.println("Esse livro já está emprestado");
        }
    }


}
