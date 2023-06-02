import java.util.Scanner;

public class MainLoja {
    public static void main(String[] args) {
       Vendedores[] vd = new Vendedores[5];
       Administrativo[] adm = new Administrativo[5];
        Scanner sc = new Scanner(System.in);
       int cv,ca,op;
       cv = 0;
       ca = 0;
       op = 1;

       while (op!=5){
           System.out.println("Digite uma das opcoes: \n");
           System.out.println("1 - Inserir Administrativo: ");
           System.out.println("2 - Inserir Vendedor: ");
           System.out.println("3 - Mostrar Funcionarios Adm: ");
           System.out.println("4 - Mostrar Vendedores: ");
           System.out.println("5 - Fechar Folha Sarial de Funcionarios: ");
           System.out.println("6 - Sair ");

           op = sc.nextInt();
           switch (op){
               case 1:
                   System.out.println("Digite o nome : ");
                   String n = sc.next();
                   System.out.println("Digite o RG: ");
                   String r = sc.next();

                   adm[ca] =new Administrativo(n,r);
                   ca++;
                   break;
               case 2:
                   System.out.println("Digite o nome : ");
                   n = sc.next();
                   System.out.println("Digite o RG: ");
                   r = sc.next();

                   vd[cv] =new Vendedores(n,r);
                   cv++;
                   break;
               case 3:
                   for(int i = 0; i < ca;i++){
                       System.out.println(adm[i].mostraDados());
                   }
                   break;

               case 4:
                   for(int i = 0; i < cv;i++){
                       System.out.println(vd[i].mostraDados());
                   }
                   break;

               case 5:
                   System.out.println("===================\nAdministrativos\n===================");
                   for(int i = 0; i < ca;i++){
                       System.out.println(adm[i].mostraDados() + " Salario Total: " + adm[i].salarioTotal());
                   }

                   System.out.println("\n===================\nVendedores\n===================");
                   for(int i = 0; i < cv;i++){
                       System.out.println(vd[i].mostraDados() + " Salario Total: " + vd[i].salarioTotal());
                   }
                   break;
               case 6:
                   System.out.println("SAINDO");


           }



       }
    }
}
