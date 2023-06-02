public class Funcionario {
    private String nome;
    private String rg;
    private int salarioBase;

    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = 1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return
                "Nome= " + nome  +
                " RG= " + rg
                ;
    }
}
