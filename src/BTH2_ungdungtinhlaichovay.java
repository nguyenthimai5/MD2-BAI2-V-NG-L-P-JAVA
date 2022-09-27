import java.util.Scanner;

public class BTH2_ungdungtinhlaichovay {
    public static void main(String[] args) {
      double tienGui=1.0;
      int thangGui=1;
      double tiLeLaiXuat=1.0;
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        tienGui=input.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        thangGui=input.nextInt();
        System.out.println("Nhập số tỉ lệ lãi xuất: ");
        tiLeLaiXuat=input.nextDouble();
        double tongLai=0;
        for (int i=0;i<thangGui;i++){
            tongLai +=tienGui*(tiLeLaiXuat/100)/12*thangGui;
        }
        System.out.println("Tổng số tiền lãi cho vay là:"+tongLai);
    }
}
