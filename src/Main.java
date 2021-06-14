import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, username1, password1, pass;
        int a=0;
        username = "Patika";
        password = "Java123";
        System.out.print("Kullanıcı Adı Giriniz: ");
        username1 = input.nextLine();
        System.out.print("Şifre Girin: ");
        password1 = input.nextLine();
        if (username.equals(username1) && password.equals(password1))
            System.out.println("Giriş Yapıldı!");
        else if (username.equals(username1) && !password.equals(password1)) {
            System.out.println("Hatalı Şifre Girdiniz!");
            System.out.println("Şifre Yenilemek İster Misiniz?");
            System.out.println("1-Evet, 2-Hayır");
            a = input.nextInt();
        }
        else
            System.out.println("Giriş Yapılamadı");
        if(a=1){
            System.out.print("Yeni Şifre Girin: ");
            pass=input.nextLine();
            if(pass.equals(password) || pass.equals(password1))
                System.out.println("Şifre Oluşturulamadı!");
            else
                System.out.println("Şifre Oluşturuldu!");
        }
        else if(a=2)
            System.out.println("Giriş Yapılamadı");
    }
}

