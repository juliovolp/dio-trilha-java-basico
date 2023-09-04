public class Operadores {
  public static void main(String[] args) {
    /*int numero = 5;

    numero = -numero;
    
    System.out.println(numero);
    numero = numero * -1;
    System.out.println(numero);
*/
    int numero = 5;
    
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
    System.out.println(variavel);
  }
}