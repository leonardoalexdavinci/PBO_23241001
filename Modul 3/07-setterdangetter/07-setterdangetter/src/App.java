class data{

    //data member atau variable
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;


    //konstruktor dengan modifier public
    public data(){
        this.intPublic = 0;
        this.intPrivate = 1000;
        this.doublePrivate = 3.60;
    }

    //method modifier default
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
    }

    //method setter
    public void setintPrivate(int value){
        this.intPrivate = value;
    }

    //method getter
    public double getdoublePrivate(){
        return this.doublePrivate;
    }
 
    
}




public class App {
        public static void main(String[] args) throws Exception {
        //instansi objek
        data objek = new data();

        //baca dan tulis dengan public
        objek.intPublic = 50;//
        System.out.println("Public : " + objek.intPublic);

        //tulis saja (setter)
        objek.setintPrivate(10);
        objek.cetak();

        //baca saja (getter)
        double angka = objek.getdoublePrivate();
        System.out.println("getter : " + angka);

        }
}
            

  