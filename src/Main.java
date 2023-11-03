import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("введите расстояние до адреса доставки");
        int deliveryDistance=imputDatа();
        calculateDeliveryDay(deliveryDistance);
        int countDay=calculateDeliveryDay(deliveryDistance);
        calculateDeliveryTime(countDay);

    }

    public static void calculateDeliveryTime(int i) {
        switch (i){
            case 1:
                System.out.println("доставка составляет "+i+" день");
                break;
            case 2,3:
                System.out.println("доставка составляет "+i+ " дня");
                break;
            default:
                System.out.println("доставки нет");
                break;
        }
    }

    public static int calculateDeliveryDay(int deliveryDistance) {
        int countDay = 0;
        if (deliveryDistance > 100&&deliveryDistance<=0) {
           countDay=0;
        }
        else if (deliveryDistance>0&&deliveryDistance < 20) {
            countDay++;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            countDay+=2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            countDay +=3;
        }
        return countDay;
    }

    public static int imputDatа() {
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}