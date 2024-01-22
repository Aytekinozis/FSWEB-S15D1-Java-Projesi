import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {


        static Scanner scanner = new Scanner(System.in);
        static boolean isRunning = true;

        static List<String> shoppingCart = new ArrayList<>();

    static void addItems(String item) {
        shoppingCart.add(item);
    }
    static void removeItems(String item) {
        shoppingCart.remove(item);
    }

    static boolean checkItemIsInList(String item){
        return shoppingCart.contains((item));
    }

    static void printSorted(){
        Collections.sort(shoppingCart);
        System.out.println(shoppingCart);
    }



    public static void main(String[] args) {
        while (isRunning){
            System.out.println("durdurmak icin 0, deger girmek icin 1, silmek icin 2 girin.");
            String deger = scanner.next();
            if (deger.equals("0")){
                break;
            }

            if (deger.equals("1")) {
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                addItems(scanner.next());
                printSorted();
            }
            if (deger.equals("2")) {
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                removeItems(scanner.next());
                printSorted();
            }
        }
    }
}