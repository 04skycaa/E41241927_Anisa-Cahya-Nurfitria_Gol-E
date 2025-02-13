import java.util.Scanner;
public class praktik4 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        
        System.out.println("masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.println("masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlaj =" +jumlah);
    }
}
