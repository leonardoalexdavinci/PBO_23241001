

class Hitung_Gaji_Bersih{
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;
    
    void setGajiPokok(int gajiPokok){
        this.gaji_pokok = gajiPokok;
    }
    
    public int getGajiPokok(){
        return this.gaji_pokok;
    }
    
    void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public  int getTunjangan(){
        return this.tunjangan;
    }
    
    void setPajak(double pajak){
        this.pajak = pajak;
    }
    
    public double getPajak(){
        return ((this.gaji_pokok + this.tunjangan)* pajak/100);
    }
    
    public void cetakGajiBersih(){
        double Pajak = getPajak();
        double gajiBersih = ((this.gaji_pokok + this.tunjangan)- Pajak);
        System.out.println("Jadi Gaji Bersihnya adalah : Rp." + gajiBersih);
    }
    
}


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hitung_Gaji_Bersih hgb = new Hitung_Gaji_Bersih();
        
        hgb.setGajiPokok(2000000);
        hgb.setTunjangan(750000);
        hgb.setPajak(7);
                
        hgb.cetakGajiBersih();
    }
    
}
