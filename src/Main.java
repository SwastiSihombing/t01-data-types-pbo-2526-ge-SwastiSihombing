import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (soal.equals("Soal1")) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("a = " + a);
        
        try{
            int hasil = Math.addExact(a,b);
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("OVERFLOW");
        }
    }
        else if (soal.equals("Soal2")) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float sumFloat = (float) x + (float) y;
            double sumDouble = x + y;

            double diff = Math.abs(sumDouble - sumFloat);

            System.out.printf("%.6f%n", diff);
        }

        else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

            Integer a = N;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        else if (soal.equals("Soal4")) {
            String S = sc.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        else if (soal.equals("Soal5")) {
            String intStr = sc.next();
            String doubleStr = sc.next();
            String boolStr = sc.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean flag = Boolean.parseBoolean(boolStr);

            double result = i * d;

            if (!flag) {
                result *= -1;
            }

            System.out.printf("%.2f%n", result);
        }

        sc.close();
    }
}
    
