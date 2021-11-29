package task;

import java.util.Scanner;

public class Task {

    public static boolean isMersennePrime(int num) {
        if (isPrimeNum(num - 1)) {
            return true;
        } else return isPrimeNum(num + 1);
    }


    public static boolean isPrimeNum(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter some thing");
            String a = scanner.nextLine();
            try {
                int num = Integer.parseInt(a);
                if (isPrimeNum(num)) {
                    System.out.println("it is regular prime number");
                } else if (isMersennePrime(num)){
                    System.out.println("it is Mersenne Prime number");
                }else {
                    System.out.println("it is not a prime number");
                }
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
            if (a.equals("quite")) {
                System.out.println("application exited");
                break;
            }
        }


    }

}

