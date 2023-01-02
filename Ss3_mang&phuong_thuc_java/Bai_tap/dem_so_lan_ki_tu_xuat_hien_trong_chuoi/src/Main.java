import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ki tu ban muon ra soat.");
        String str = sc.nextLine();
        int[] arrChar;
        arrChar = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (str.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    for (int k = 0; k < str.length(); k++) {

                    }
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    }
                }
                System.out.println("Ki tu "+str.charAt(i)+ " xuat hien "+count + " lan");
            }
        }
    }
}