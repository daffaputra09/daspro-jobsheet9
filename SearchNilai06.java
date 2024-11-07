import java.util.Scanner;

public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = input.nextInt();
        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1) + "\n");
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan\n");
        }
    }
}
