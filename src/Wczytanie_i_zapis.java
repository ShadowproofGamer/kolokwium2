import java.io.*;
import java.util.ArrayList;

public class Wczytanie_i_zapis {
    public Wczytanie_i_zapis(){
        try(
                BufferedReader br = new BufferedReader(new FileReader("src/a_przykladowe_dane/txt.txt"));
        ){
            ArrayList<String[]> arr = new ArrayList<>();
            String t=".";
            while ((t = br.readLine()) != null && t.length()>0){
                arr.add(t.split("\\s+"));
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("brak pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
