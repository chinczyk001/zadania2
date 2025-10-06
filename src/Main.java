import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        pierwiastki();
        fibonacci();
        parzysteINieparzyste();
    }

    public static void pierwiastki() {
        double tablicaPierwiastkow[] = new double[10];
        for (int i = 0; i < tablicaPierwiastkow.length; i++) {
            tablicaPierwiastkow[i] = Math.sqrt(i);
        }
        for (int i = 0; i < tablicaPierwiastkow.length; i++) {
            System.out.println(i + " = " + tablicaPierwiastkow[i]);
        }
    }
    public static void fibonacci(){
        int tablicaCiaguFibonacciego[] = new int[40];

        tablicaCiaguFibonacciego[0] = 0;
        tablicaCiaguFibonacciego[1] = 1;

        for (int i = 2; i < tablicaCiaguFibonacciego.length; i++) {
            tablicaCiaguFibonacciego[i] = tablicaCiaguFibonacciego[i-1] + tablicaCiaguFibonacciego[i-2];
        }

        for (int i = 0; i < tablicaCiaguFibonacciego.length; i++) {
            System.out.println(tablicaCiaguFibonacciego[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbe");
        int twojaLiczba = scanner.nextInt();

    }


    public static void parzysteINieparzyste(){
        int tablicaLiczbCalkowitych[] = new int[100];
        ArrayList<Integer> parzyste = new ArrayList<>();
        ArrayList<Integer> nieparzyste = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < tablicaLiczbCalkowitych.length; i++) {
            tablicaLiczbCalkowitych[i] = random.nextInt(100)+ 1;
            if(tablicaLiczbCalkowitych[i] % 2== 0){
              parzyste.add(i);
            }else{
                nieparzyste.add(i);
            }
        }

    }

}