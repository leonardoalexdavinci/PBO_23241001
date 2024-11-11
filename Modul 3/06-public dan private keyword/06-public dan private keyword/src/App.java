class data{
    //Data member atau variable instant
    String nama; //DEFAULT, dia bisa diakses di luar class
    public String prodi; //public, bisa diakses diluar class
    private double ipk;//private, hanya bisa diakses oleh class itu sendiri


    //konstruktor
    data(String nama, String prodi, double ipk){
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

        //default modiifier access method
        void cetakdata(){
            tambahipk(); //contoh access private method
            System.out.println("nama : " + this.nama);
            System.out.println("prodi : " + this.prodi);
            System.out.println("ipk : " + this.ipk);

        }
        //public modifier access method
        public void ubahnama(String namaBaru){
            this.nama = namaBaru;
        }

        //private modifier access method
        private void tambahipk(){
            this.ipk += 0.5;
        }

           
}






public class App {
    public static void main(String[] args) throws Exception {
        //instansiasi object
        data data1 = new data("togi", "PTI", 3.71);
        //modifier access default
        System.out.println(data1.nama);
        data1.nama = " togi uciha";
        System.out.println(data1.nama);

        //modifier access public
        System.out.println(data1.prodi);
        data1.prodi = "mesin";
        System.out.println(data1.prodi);

        //modifier access private
        // System.out.println(data1.ipk);
        // data1.ipk = "mesin";
        // System.out.println(data1.ipk);

        //method default
        data1.cetakdata();

        //method public
        data1.ubahnama("irzu hyuga");
        data1.cetakdata();

        //mehode private
        // data1.tambahipk();

        
    }
}
