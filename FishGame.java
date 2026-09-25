import java.util.Scanner;

public class FishGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int round = 1; round <= 5; round++) {

            System.out.print("Enter number of fish: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(n + " machhli ");
            }

            for (int i = 1; i <= n; i++) {
                System.out.print("paani mein gayi ");
            }

            for (int i = 1; i <= n; i++) {
                System.out.print("chhapak ");
            }

            System.out.println();
        }

        sc.close();
    }
}