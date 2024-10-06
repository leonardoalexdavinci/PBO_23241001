class Kalkulator{
    // atribut
    double hasilPerkalian;
    double hasilPembagian;
    double hasilPenjumlahan;
    double hasilPengurangan;

    // constructor
    Kalkulator (double angka1, double angka2){
        hasilPenjumlahan = angka1 + angka2;
        hasilPengurangan = angka1 - angka2;
        hasilPerkalian = angka1 * angka2;
        hasilPembagian = angka1 / angka2;
        
        System.out.println("\nHasil Penjumlahan : " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan : " + hasilPengurangan);
        System.out.println("Hasil Perkalian  : " + hasilPerkalian);
        System.out.println("Hasil Pembagian : " + hasilPembagian);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi object class kalkulator
        Kalkulator kalkulatorSatu = new Kalkulator(1.2, 3.9);
        Kalkulator kalkulatorDua = new Kalkulator(2, 4);
      
    }
}
