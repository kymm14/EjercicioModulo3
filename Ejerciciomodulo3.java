
public class Ejerciciomodulo3 {
  public static void main(String[] args) {
    System.out.println("Buenos días");
    System.out.println("8*13");
    int resultado = 8 * 13;
    System.out.println("El resultado de la multiplicación 8*13 es: " + resultado);
    int resultado2 = 1 + 2 + 3;
    System.out.println("1 + 2 + 3 = " + resultado2);
    int a = 2;
    int b = 3;
    int c = 4;

    System.out.println("La suma de las tres variables es: " + (a + b + c));

    c = 5;

    System.out.printf("La suma de las tres variables es: %d\n", a + b + c);
    
    int angulo1 = 60;
    int angulo2 = 60;
    int angulo3 = 60;

    if (angulo1 + angulo2 + angulo3 == 180) {
      System.out.println("Estos ángulos pueden formar un triángulo.");
    } else {
      System.out.println("Estos ángulos no pueden formar un triángulo.");
      
      int num1 = 5;
      int num2 = 10;
      int num3 = 15;
      int num4 = 20;

      int mayor = num1;

      if (num2 > mayor) {
        mayor = num2;
      }

      if (num3 > mayor) {
        mayor = num3;
      }

      if (num4 > mayor) {
        mayor = num4;
      }

      System.out.println("El número mayor es: " + mayor);
    }
  }
}