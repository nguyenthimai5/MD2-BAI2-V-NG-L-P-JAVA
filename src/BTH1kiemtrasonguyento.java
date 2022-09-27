import java.util.Scanner;

public class BTH1kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số:");
        int num=scanner.nextInt();
        if(num>=2){
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(num)){
                if (num%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.printf(num+" là số nguyên tố");
            }else {
                System.out.printf(num+" không phải là số nguyên tố");
            }
        }else {
            System.out.printf(num+" không phải là số nguyên tố");
        }
    }
}
