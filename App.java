import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Admin";
        String captcha = generateCaptcha();
        System.out.println("Selamat datang! Silakan login.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();
        System.out.println("CAPTCHA: " + captcha);
        System.out.print("Masukkan CAPTCHA: ");
        String inputCaptcha = scanner.nextLine();
        scanner.close();

        if (checkCaptcha(inputCaptcha, captcha) && checkLogin(inputUsername, inputPassword, username, password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Coba lagi.");
        }
    }

    public static boolean checkLogin(String inputUsername, String inputPassword, String username, String password) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public static String generateCaptcha() {
        return "XxYyZz";
    }

    public static boolean checkCaptcha(String inputCaptcha, String captcha) {
        return captcha.equalsIgnoreCase(inputCaptcha);
    }
}