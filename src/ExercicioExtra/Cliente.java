package ExercicioExtra;

public class Cliente {

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void boasVindas(){
        System.out.println("Seja bem vindo(a): "+getNome());
    }
}
