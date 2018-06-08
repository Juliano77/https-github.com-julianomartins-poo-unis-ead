import javax.swing.JOptionPane;;

public class CalculoIMC
{
  /*
 * Classe JOptionPane (javax.swing)
 * Métodos Estáticos:
 * .showMessageDialog(null,"mensagem");
 * .showInputDialog("mensagem");
  */
  
 public static void main(String[] args) 
 {
  float peso, altura;
 float imc;

 peso = Float.parseFloat(
 JOptionPane.showInputDialog("Digite seu peso"));
 
 altura = Float.parseFloat(
 JOptionPane.showInputDialog("Digite sua altura") );
  
 imc = peso / (altura*altura);
 
 if (imc <16){
            System.out.println("Magreza grave");            
        }else if (imc >= 16 && imc <= 17){
            System.out.println("Magreza moderada");
        }else if (imc >= 17 && imc <= 18.5){
            System.out.println("Magreza leve");
        }else if (imc >= 18.5 && imc <= 25){
            System.out.println("Saudável");
        }else if (imc >= 25 && imc <= 30){
            System.out.println("Sobrepeso");
            }else if (imc >= 30 && imc <= 35){
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35 && imc <= 40){
            System.out.println("Obesidade Grau II");  
        }else 
            System.out.println("Obesidade grau III");  

        }
    }
 }
