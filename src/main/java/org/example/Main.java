package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "java", userName = "patika";
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız :");
        String usernameIn = input.nextLine();
        System.out.print("Şifreniz :");
        String passwordIn = input.nextLine();

        if (password.equals(passwordIn) && userName.equals(usernameIn)) {
            System.out.println("Kullanıcı adı ve Şifreniz doğru. Giriş yapıldı.");
        } else if ((!password.equals(passwordIn)) && (!userName.equals(usernameIn))) {
            System.out.println("Kullanıcı adı ve şifreyi hatalı girdiniz tekrar deneyiniz.");
        } else if ((!usernameIn.equals(userName))) {
            System.out.println("Kullanıcı adını hatalı girdiniz. Tekrar giriş yapınız.");

        } else {
            System.out.println("Hatalı şifre girişi yaptınız. Şifrenizi sıfırlamak ister misiniz ?");
            System.out.print("1. Evet\n2. Hayır\nSeçiminiz :");
            String choice = input.nextLine();

            if (choice.equals("2")) {
                System.out.print("Tekrar giriş yapınız.");

            } else if (choice.equals("1")) {
                System.out.print("Yeni şifrenizi giriniz :");
                String newPass = input.nextLine();
                if (newPass.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen eski şifrenizden farklı bir şifre girerek tekrar deneyiniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }

            } else
                System.out.println("1 veya 2 seçeneğini seçemediğiniz için hatalı giriş yaptınız. Tekrar deneyiniz.");
        }
    }
}