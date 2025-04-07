package br.com.fiap.bean;

/* Nome:Luna de Carvalho Guimarães RM:562290
   Nome:Andrei de Paiva Gibbini RM:563061
   Nome:Aline Lourenço Carvalho RM:564538 */
public class DespesaFamiliar {
    // atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    // métodos
    public double calcularTotalDeDespesas(){
        double academia, totalDespesas;

        academia= numeroDeMoradores * valorMensalidadeDaAcademia;
        totalDespesas= academia + gastoComAgua + gastoComInternet + gastoComLuz;

        return totalDespesas;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendaLiquida;

        rendaLiquida=rendaFamiliar - calcularTotalDeDespesas();

        return rendaLiquida;
    }

}
