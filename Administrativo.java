import java.util.Random;

public class Administrativo extends Funcionario{


    private int horasExtra;

    public Administrativo(String nome, String rg) {
        super(nome, rg);
        Random ge = new Random();
        setHorasExtra((int)ge.nextInt(100) + 1 );


    }


    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        if(this.horasExtra  < 0)this.horasExtra = 0;
        this.horasExtra = horasExtra;
    }

    public int salarioTotal(){
        int total  =  (int) (super.getSalarioBase() + (super.getSalarioBase() * 0.01) * getHorasExtra());
        setHorasExtra(0);
        return total;
    }
    public String mostraDados(){
        return super.toString() + " Horas extras: " + getHorasExtra();
    }
}
