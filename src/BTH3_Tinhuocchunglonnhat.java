import java.util.Scanner;

public class BTH3_Tinhuocchunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập a:");
        a=scanner.nextInt();
        System.out.println("nhập b:");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("không có ước chung lớn nhất");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
                System.out.println("a= "+a);
                break;
            }else {
                b=b-a;
                System.out.println("b= "+b);

            }
        }
        System.out.println("Ước chung lớn nhất là:"+a);
    }
}
