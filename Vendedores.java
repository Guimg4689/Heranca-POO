import java.util.Random;

public class Vendedores extends Funcionario{
    private int totalVendas;


    public Vendedores(String nome, String rg) {
        super(nome, rg);
        Random ge = new Random();
        setTotalVendas(ge.nextInt(100000)+1);
    }





    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int comissao) {
        this.totalVendas = comissao;
    }

    public int salarioTotal(){
        int total =  getSalarioBase() + (int)(getTotalVendas() * 0.05);
        setTotalVendas(0);
        return total;
    }
    String mostraDados(){
        return super.toString() + " Total de Vendas " + getTotalVendas();
    }
}
