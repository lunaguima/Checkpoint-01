package br.com.fiap.main;

// Nome:Luna de Carvalho Guimarães RM:562290
// Nome:Andrei de Paiva Gibbini RM:563061
// Nome:Aline Lourenço Carvalho RM:564538
import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa= new DespesaFamiliar();
        double renda;
        int moradores;
        double luz;
        double agua;
        double internet;
        double mensalidade;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite sua renda familiar:");
            renda = scan.nextDouble();
            System.out.println("Digite o número de moradores em sua residência");
            moradores= scan.nextInt();
            System.out.println("Digite quanto é a sua conta de luz:");
            luz = scan.nextDouble();
            System.out.println("Digite quanto é a sua conta de água:");
            agua = scan.nextDouble();
            System.out.println("Digite quanto é a sua conta de internet:");
            internet= scan.nextDouble();
            System.out.println("Digite quanto é sua mensalidade da Academia:");
            mensalidade= scan.nextDouble();

            despesa.rendaFamiliar = renda;
            despesa.numeroDeMoradores = moradores;
            despesa.gastoComLuz = luz;
            despesa.gastoComAgua = agua;
            despesa.gastoComInternet = internet;
            despesa.valorMensalidadeDaAcademia = mensalidade;


            System.out.printf("Renda familiar é de R$%.3f\nTotal de Gastos R$%.3f \nRenda Líquida R$%.3f", renda,despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida() );

        } catch (Exception e) {
            System.out.println("Formato incorreto");
        }
    }
}
