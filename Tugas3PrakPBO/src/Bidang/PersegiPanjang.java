
package Bidang;
import Ruang.*;

public class PersegiPanjang extends Balok implements MenghitungBidang {
    public PersegiPanjang(double panjang, double lebar, double tinggi){
        super(panjang,lebar,tinggi);
    }
    
    @Override
    public double luas(){
        return panjang * lebar;
    }
    
    @Override
    public double keliling(){
        return 2 * (panjang + lebar);
    }
}
