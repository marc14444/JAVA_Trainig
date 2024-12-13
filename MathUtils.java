/* public class main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);
        int difference = a - b;
        System.out.println("Difference of " + a + " and " + b + " is " + difference);
        double quotient = (double) a / b;
        System.out.println("Quotient of " + a + " and " + b + " is " + quotient);
        int remainder = a % b;
        System.out.println("Remainder of " + a + " and " + b + " is " + remainder);
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
} */

//Arrays
/* public class Array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
       // System.out.println(a[4]);
    }
} */

//Data Types
/* public class DataType {

    public static void main(String[] args) {
        int number = 5;
        float number1 = 5.0f;
        double number2 = 5.0;
        char character = 'a';
        boolean isboolean1 = true;
        boolean isboolean2 = false;
        String string = "Hello World";
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(character);
        System.out.println(isboolean1);
        System.out.println(isboolean2);
        System.out.println(string);
    }
} */

//Types Casting
/* public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 5;
        long longValue = intValue * 2;
        System.out.println(longValue);

        double doubleValue = 5.5;
        int intValue2 = (int) doubleValue;
        System.out.println(intValue2);
    }
} */

//Operations
/* public class Operator {
    public static void main(String[] args) {
        int a = 5, b = 5;
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLessOrEqual = a <= b;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);
        int difference = a - b;
        System.out.println("Difference of " + a + " and " + b + " is " + difference);
        double quotient = (double) a / b;
        System.out.println("Quotient of " + a + " and " + b + " is " + quotient);
        int remainder = a % b;
        System.out.println("Remainder of " + a + " and " + b + " is " + remainder);
    }
} */

//Trings
/* public class Strings { 
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";
        String concatenation = string1 + " " + string2;
        System.out.println(concatenation.toUpperCase());
        String string3 = "merci";
        String string4 = "beaucoup";
        String concatenation2 = string3 + " " + string4;
        System.out.println(concatenation2.toLowerCase());
        int length = string1.length();
        System.out.println(length);
        char[] charArray = string1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        char[] charArray2 = string2.toCharArray();
        for (int i = 0; i < charArray2.length; i++) {
            System.out.println(charArray2[i]);
        }
        char[] charArray3 = string3.toCharArray();
        for (int i = 0; i < charArray3.length; i++) {
            System.out.println(charArray3[i]);
        }
        char[] charArray4 = string4.toCharArray();
        for (int i = 0; i < charArray4.length; i++) {
            System.out.println(charArray4[i]);
        }
        if (string1.equals(string2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (string1.equals(string3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
*/

//Math
/* import java.util.Random;

public class Math {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 10;
        int min = 0;
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println(randomNumber);
    }
} */

//boolean
/* public class Boolean {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
        if (!isTrue) {
            System.out.println("isTrue is true");
        } else {
            System.out.println("isTrue is false");
        }
        if (!isFalse) {
            System.out.println("isFalse is true");
        } else {
            System.out.println("isFalse is false");
        }
    }
} */

//Switch
/* import java.util.Calendar;
public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                System.out.println("Monday");
                break;
            case Calendar.TUESDAY:
                System.out.println("Tuesday");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thursday");
                break;
            case Calendar.FRIDAY:
                System.out.println("Friday");
                break;
            case Calendar.SATURDAY:
                System.out.println("Saturday");
                break;
            case Calendar.SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
} */

//while
/* public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 0;
        while (index < numbers.length) {
            System.out.println("tableau" + numbers[index]);
            index++;
        }

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("tableau1");
            System.out.println("tableau2");
            System.out.println("tableau3");
            System.out.println("tableau4");
            System.out.println("tableau5");
            isTrue = false;
        }
    }   
} */

//for
/* public class forLoop{
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
} */

//Break
/* public class Breakst {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }
            for (int j = 0; j < 9; j++) {
                if(j == 4) {
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }

        int i2 = 0;
        while (i2 < 50) {
            if(i2 == 5) {
                i2++;
                continue;
            }
            System.out.println(i2);
            i2++;
        }
    }
} */

//Method
/* public class MethodSt {
    static void sayHello() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        sayHello();
    }
} */

//Class and object
/* public class Car {

        String make;
        String model;
        int year;

        void start(){
            System.out.println("Staring");
        }
} */


public class MathUtils {

    // Opérations de base
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    // Autres opérations
    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
/* 
    public static double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not allowed");
        }
        return Math.sqrt(a);
    }

    // Fonctions avancées
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double log(double a) {
        return Math.log(a);
    }

    public static double log10(double a) {
        return Math.log10(a);
    }

    public static double exp(double a) {
        return Math.exp(a);
    }

    // Fonctions trigonométriques
    public static double sin(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static double asin(double a) {
        return Math.asin(a);
    }

    public static double acos(double a) {
        return Math.acos(a);
    }

    public static double atan(double a) {
        return Math.atan(a);
    }

    public static double atan2(double a, double b) {
        return Math.atan2(a, b);
    }

    // Conversion d'angles
    public static double toRadians(double a) {
        return Math.toRadians(a);
    }

    public static double toDegrees(double a) {
        return Math.toDegrees(a);
    }

    // Autres fonctions
    public static double ceil(double a) {
        return Math.ceil(a);
    }

    public static double floor(double a) {
        return Math.floor(a);
    }

    public static double round(double a) {
        return Math.round(a);
    }

    public static double rint(double a) {
        return Math.rint(a);
    }

    public static double random() {
        return Math.random();
    }

    public static double random(double min, double max) {
        return min + (Math.random() * (max - min));
    }
    */

    // Méthode main pour tester
    public static void main(String[] args) {
        System.out.println("Addition: " + MathUtils.add(10, 5));
        System.out.println("Soustraction: " + MathUtils.sub(10, 5));
        System.out.println("Multiplication: " + MathUtils.mul(10, 5));
        System.out.println("Division: " + MathUtils.div(10, 5));
        System.out.println("Modulo: " + MathUtils.mod(10, 5));
        System.out.println("Absolute value: " + MathUtils.abs(-10));
        System.out.println("Minimum: " + MathUtils.min(10, 5));
        System.out.println("Maximum: " + MathUtils.max(10, 5));
        //System.out.println("Square root: " + MathUtils.sqrt(25));
        //System.out.println("Random number (0-1): " + MathUtils.random());
        //System.out.println("Random number (1-10): " + MathUtils.random(1, 10));
    }
}