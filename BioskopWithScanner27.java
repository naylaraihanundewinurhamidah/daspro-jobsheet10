import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while(true){
            System.out.print("Masukan nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukan baris: ");
            baris = scanner.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = scanner.nextInt();
            
            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Apakah ingin menambahkan penonton? (y/n)");
            next = scanner.next();

            if(next.equalsIgnoreCase("n")){
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
