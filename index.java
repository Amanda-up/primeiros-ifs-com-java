import java.util.Scanner;

public class Desafio {

    public static void main(Stings[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
        }
        if (valorSalario >= 1100.01 && valorSalario <= 2500){
            valorImposto = 0.10F * valorSalario;
        }
        if (valorSalario > 2500.00){
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}