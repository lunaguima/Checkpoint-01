package br.com.fiap.bean;

// Nome:Luna de Carvalho Guimarães RM:562290
// Nome:Andrei de Paiva Gibbini RM:563061
// Nome:Aline Lourenço Carvalho RM:564538
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
        double academia, totaldespesas;

        academia= numeroDeMoradores * valorMensalidadeDaAcademia;
        totaldespesas= academia + gastoComAgua + gastoComInternet + gastoComLuz;

        return totaldespesas;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendaliquida;

        rendaliquida=rendaFamiliar - calcularTotalDeDespesas();

        return rendaliquida;
    }

}
