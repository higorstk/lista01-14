import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável  
  double pesodopeixe;
  double excesso;
  double multa;
//Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o KG pescado");
pesodopeixe = teclado.nextDouble();

if (pesodopeixe <= 50){
    System.out.println("Sem multa");
}
    else{
        if (pesodopeixe > 50){
    excesso = (pesodopeixe - 50);
    multa = (excesso * 4);
        System.out.println("Excesso pescado é:" + excesso);
        System.out.println("Valor da multa é R$" + multa);

   }
  }
 }
}
