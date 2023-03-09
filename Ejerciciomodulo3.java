
Ejercicio 1

public class Ejerciciomodulo3 {
  public static void main(String[] args) {
    System.out.println("Buenos días");
    System.out.println("8*13");  
    int resultado = 8 * 13;
    System.out.println("El resultado de la multiplicación 8*13 es: " + resultado);
    
    
    Ejercicio 2
      
    int resultado2 = 1 + 2 + 3;
    System.out.println("1 + 2 + 3 = " + resultado2);
    int a = 2;
    int b = 3;
    int c = 4;
    
    Ejercicio 3

    System.out.println("La suma de las tres variables es: " + (a + b + c));
    c = 5;
    System.out.printf("La suma de las tres variables es: %d\n", a + b + c);
    
    Ejercicio 4
    
    int angulito1 = 60;
    int angulito2 = 60;
    int angulito3 = 60;

    if (angulito1 + angulito2 + angulito3 == 180) {
      System.out.println("Estos ángulos pueden formar un triángulo.");
    } else {
      System.out.println("Estos ángulos no pueden formar un triángulo.");
      
      Ejercicio 5
      
      int numero1 = 5;
      int numero2 = 10;
      int numero3 = 15;
      int numero4 = 20;

      int mayor = numero1;

      if (numero2 > mayor) {
        mayor = numero2;
      }

      if (numero3 > mayor) {
        mayor = numero3;
      }

      if (numero4 > mayor) {
        mayor = numero4;
      }

      System.out.println("El número mayor es: " + mayor);
    }
  }
}
