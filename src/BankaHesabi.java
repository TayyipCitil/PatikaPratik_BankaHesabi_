import java.util.Scanner;

public class BankaHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord;
        int right = 3, balance = 1000, tuttar;
        boolean isError=false;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            passWord = input.nextLine();
            if (userName.equals("Tayyip") && passWord.equals("2002")) {
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-Para Yatırma\t2-Para Çekme\t3-Bakiye Sorgulama\t4-Çıkış");
                    int select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Yatırmak istediğiniz tutar: ");
                        tuttar = input.nextInt();
                        balance += tuttar;
                    } else if (select == 2) {
                        System.out.print("Çekmek istediğiniz tutat: ");
                        tuttar = input.nextInt();
                        if (tuttar > balance) {
                            System.out.println("Bakiyeniz yetersiz");
                        } else {
                            balance -= tuttar;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    } else if (select == 4) {
                        System.out.println("Güle Güle");
                        break;
                    } else {
                        System.out.println("Yanlış bir seçim yaptınıız");
                    }
                }while (!isError);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke edildi");
                    break;
                } else {
                    System.out.println("Şifre veya Kullanıcı adı yanlış");
                    System.out.println("Lütfen tekrar deneyiniz");
                    System.out.println("Kalan deneme hakkı: " + right);
                }
            }
        }
    }
}