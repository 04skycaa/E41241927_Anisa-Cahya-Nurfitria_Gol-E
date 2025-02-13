import java.util.Scanner;

public class praktik2_1 {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();
        
        if (nilai >= 90 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 80 && nilai <=90) {
            grade = "B+";
        } else if (nilai >= 70 && nilai <=80) {
            grade = "B";
        } else if (nilai >= 60 && nilai <=70) {
            grade = "C+";
        } else if (nilai >= 50 && nilai <=60) {
            grade = "C";
        } else if (nilai >= 40 && nilai <=50) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("Grade: " + grade);
    }
}
