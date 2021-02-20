package uas.if2.pkg10119049.nursasongko.pkg8;
/**
 *
 * @author Sasongko
 */
public class Persegi implements BangunDatar {
    private int luas;
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public void hitungLuas(){
        luas = sisi * sisi;
        System.out.printf("Luas Persegi : %d \n",luas);
    }
}



