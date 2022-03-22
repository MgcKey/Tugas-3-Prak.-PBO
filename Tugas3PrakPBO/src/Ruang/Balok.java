
package Ruang;

public class Balok implements MenghitungRuang{
    public double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return panjang * lebar * tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
