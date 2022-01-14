public class Towar implements Comparable<Towar>{
    String nazwa;
    int ilosc;
    double cena;
    double wartosc;
    public Towar(String nazwa, int ilosc, double cena){
        this.nazwa=nazwa;
        this.ilosc=ilosc;
        this.cena=cena;
        this.wartosc = cena*ilosc;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-10.2f %-4d %-10.2f \n", nazwa, cena, ilosc, wartosc);
        //return " \t" +nazwa + " \t" + ilosc + " \t" + cena+ " \t" + wartosc;
        //String.valueOf()
    }

    @Override
    public int compareTo(Towar o) {
        return nazwa.compareTo(o.nazwa);
    }
}
