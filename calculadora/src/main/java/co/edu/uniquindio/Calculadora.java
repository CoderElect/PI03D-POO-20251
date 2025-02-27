public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

<<<<<<< Updated upstream
    public static int dividir(int valor1, int valor2){
        int resultado = 0;
        if(valor2 != 0){
            resultado = valor1 / valor2;
        }
        return resultado;
=======
    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return (double) a / b;
>>>>>>> Stashed changes
    }

    public static String calculadora(int operador, int valor1, int valor2){
        String resultado = "";
        if(operador == 1){
            resultado = "El valor de la suma es: " + sumar(valor1, valor2);
        }else if(operador == 2){
            resultado = "El valor de la resta es: " + restar(valor1, valor2);
        } else if (operador == 3) {
            resultado = "El valor de la multiplicación es: " + multiplicar(valor1, valor2);
        } else if (operador == 4){
            resultado = "El valor de la división es: " + dividir(valor1, valor2);
        }
        return  resultado;
    }

    public static String calculadora2(char operador, int valor1, int valor2){
        String resultado = "";
        if(operador == '+'){
            resultado = "El valor de la suma es: " + sumar(valor1, valor2);
        }else if(operador == '-'){
            resultado = "El valor de la resta es: " + restar(valor1, valor2);
        } else if (operador == '*') {
            resultado = "El valor de la multiplicación es: " + multiplicar(valor1, valor2);
        } else if (operador == '/'){
            resultado = "El valor de la división es: " + dividir(valor1, valor2);
        }
        return  resultado;
    }

    public static void main(String[] args) {
<<<<<<< Updated upstream

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el operador: ");
        char operador = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println(calculadora2(operador, valor1, valor2));
=======
        System.out.println("El valor de operación suma es: " + sumar(10, 2));
        System.out.println("El valor de operación resta es: " + restar(10, 2));
        System.out.println("El valor de operación multiplicación es: " + multiplicar(10, 2));
        System.out.println("El valor de operación división es: " + dividir(10, 2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.print("Ingrese el valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println("El valor de operación suma es: " + sumar(valor1, valor2));
        scanner.close();
>>>>>>> Stashed changes
    }
}

