import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Skan_i_zapis {
    public Skan_i_zapis(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Towar> arr = new ArrayList<>();
        System.out.println("wpisz ilosc towarow do wprowadzenia");
        int j = scan.nextInt();
        for (int gg=0; gg<j ;gg++){
            String s;
            int i;
            double d;
            System.out.println("wpisz produkt:");
            s = scan.next();
            System.out.println("wpisz ilosc:");
            i = scan.nextInt();
            System.out.println("wpisz cene:");
            d = scan.nextDouble();
            arr.add(new Towar(s, i, d));
        }
        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/txt11.txt"));
                ){
                    bw.write("Wykaz towarów nr 12/2020\n");
                    bw.write(String.format("%-16s %5s %6s \n", "Nazwa_towaru","Ilosc", "Cena"));
                    for (Towar t:arr){
                        bw.write(String.format("%-16s %5d %6.2f \n", t.nazwa,t.ilosc, t.cena));

                    }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
