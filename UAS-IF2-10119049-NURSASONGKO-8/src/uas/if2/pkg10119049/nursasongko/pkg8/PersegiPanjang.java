package uas.if2.pkg10119049.nursasongko.pkg8;

/**
 *
 * @author Sasongko
 */
public class PersegiPanjang implements BangunDatar {
    private int luas;
    private final int panjang;
    private final int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public void hitungLuas(){
        luas = panjang * lebar;
        System.out.printf("Luas Persegi : %d \n",luas);
    }
    
}
