import java.util.Scanner;

public class Percobaan09 {

    static int hitungLuas(int p, int l) {
        int Luas = p*l;
        return Luas;
    }
    
    static int hitungVolume(int t, int p, int l) {
        int Volume = hitungLuas(p, l) * t;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
       
    }
}