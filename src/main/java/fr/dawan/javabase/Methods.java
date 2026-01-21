package fr.dawan.javabase;

public class Methods {
    public static void main(String[] args) {
        greet();

        int sumResult = add(5,10);
        System.out.println(sumResult);

        double area = calculateCircleArea(4.5);
        System.out.println("Circle area "+area);

        System.out.println("Maximum value "+ findMax(10,5,25));
        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5 | "+factorialOf5);

        displayInfo("Alice");
        displayInfo("Bob", 25);
        System.out.println(displayInfo("Rayan", 19, 'M'));
    }

    private static int findMax(int a, int b, int c) {
        int max = a;
        if(b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }
        return max;
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static void greet() {
        System.out.println("Hello World!");
    }

    private static int add(int a, int b) {
        return a + b;
    }

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Méthodes surchargées
    //Méthodes qui a le meme nom, mais pas les meme parametre
    //La surcharge elle peut aussi changer le type de retour si besoin
    public static void displayInfo(String name)
    {
        System.out.println("Name " + name);
    }
    public static void displayInfo(String name, int age)
    {
        System.out.println("Name " + name + " , Age "+age);
    }
    public static String displayInfo(String name, int age, char gender)
    {
        return "Name " + name + " , Age "+age+" , Gender : "+gender;
    }
}
