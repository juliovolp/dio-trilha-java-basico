public class Operadores {
  public static void main(String[] args) {
    /*int numero = 5;

    numero = -numero;
    
    System.out.println(numero);
    numero = numero * -1;
    System.out.println(numero);
*/
    /*int numero = 5;
    
    System.out.println(numero++);
    //O ++ dps do numero primero mostra o num e dps incrementa
    //O mesmo valo pro --
    System.out.println(++numero);
    //O ++ antes do numero, primeiro soma e dps mostra ja o numero somado
    //O mesmo valo pro --

    boolean variavel = true;

    System.out.println(!variavel);
    variavel = !variavel;
    //!Inverter valor de uma variavel boolean
    System.out.println(variavel);*/
    /*//OPERADOR TERNÁRIO
    int a,b;
    a=6;
    b=6;
    String resultado = a==b? "Verdadeiro" : "Falso";
    

    System.out.println(resultado);*/
    /*//Operadores relacionais
    int num1=1;
    int num2=2;

    boolean simNao = num1==num2;

    System.out.println("Num1 = Num2? " +simNao);

    simNao = num1!=num2;

    System.out.println("Num1 = Num2? " +simNao);

    simNao = num1 > num2;

    System.out.println("Num1 = Num2? " +simNao);


    String nome1 = "Julio";
    String nome2 = new String("Julio");
    System.out.println(nome1.equals(nome2));*/

    //Operadores lógicos
    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && (7 > 4)){
      System.out.println("As duas condições são verdadeiras");
    }else{
      System.out.println("Fim");
    }

    if(condicao1 || condicao2){
      System.out.println("Uma das condições é verdadeira");
    }
  }
}