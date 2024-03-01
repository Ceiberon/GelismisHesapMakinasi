import java.util.Scanner;

public class Main {
    static int toplam(int a, int b) {
        int result = a + b;
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        return result;
    }

    static int bolme(int a, int b) {
        if (b != 0) {
            int result = a / b;
            return result;
        } else {
            System.out.println("İkinci sayı 0'dan farklı olmalı");
            return 0;
        }
    }


    static int uslu(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int faktoriyel(int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result = result * i;
        }
        System.out.println("Faktöriyel " + result);
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int dikdortgen(int a, int b) {
        int cevre = 2 * (a + b);
        int alan = a * b;
        System.out.println("Çevresi: " + cevre);
        System.out.println("Alanı: " + alan);
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.println("Birinci Sayıyı giriniz : ");
            int a = scan.nextInt();
            if (select != 6) {
                System.out.println("İkinci Sayıyı giriniz : ");
                int b = scan.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Toplam: " + toplam(a, b));
                        break;
                    case 2:
                        System.out.println("Çıkarma: " + cikarma(a, b));
                        break;
                    case 3:
                        System.out.println("Çarpma: " + carpma(a, b));
                        break;
                    case 4:
                        System.out.println("Bölme: " + bolme(a, b));
                        break;
                    case 5:
                        System.out.println("Üslü hesaplama: " + uslu(a, b));
                        break;
                    case 7:
                        System.out.println("Mod: " + mod(a, b));
                        break;
                    case 8:
                        dikdortgen(a, b);
                        break;
                    default:
                        System.out.println("Geçersiz bir seçim yaptınız!");
                }
            } else { //
                faktoriyel(a);
            }
        }
        System.out.println("Güle Güle !");
    }
}

