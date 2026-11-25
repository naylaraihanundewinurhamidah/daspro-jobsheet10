import java.util.Scanner;

public class Tugas127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("  Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Rata-rata Nilai per Responden ===");
        for (int i = 0; i < survei.length; i++) {
            double totalResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
            }
            System.out.println("Responden ke-" + (i + 1) + ": " + (totalResponden / survei[i].length));
        }

        System.out.println("\n=== Rata-rata Nilai per Pertanyaan ===");
        for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += survei[i][j];
            }
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + (totalPertanyaan / 10));

            sc.close();
        }
    }
}