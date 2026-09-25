import java.util.Scanner;

     class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("Number is positive");
        }
        else if(num==0){
            System.out.println("Number is zero");

        }
        else {
            System.out.println("Number is negative");
        }
        sc.close();
        }
    }



