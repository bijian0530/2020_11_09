import java.util.Scanner;

public class HotelMgtSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店管理系统，请认真阅读相关说明");
        System.out.println("功能对应的编号:[1]查看房间列表[2]表示订房[3]表示退房[0]表示提出系统");
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("请输入相关编号");
            int i = s.nextInt();
            if(i == 1){
                hotel.print();
            }
            else if(i == 2){
                System.out.println("请输入订房编号");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            }
            else if(i == 3){
                System.out.println("请输入退房编号");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            }
            else if(i == 0){
                System.out.println("欢迎下次在此光临");
                return;
            }
            else{
                System.out.println("输入错误，请重新进行输入");
            }
        }
    }
}
