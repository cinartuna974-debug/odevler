import java.util.Scanner;

class main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ucgenin kenarını gir ");
        double kenar = input.nextDouble();


        double cevre = 3 * kenar;
System.out.print("Yuksekligi gir");
double yukseklik = input.nextDouble();
double alan = kenar * yukseklik;



        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);


        input.close();
    }
}
