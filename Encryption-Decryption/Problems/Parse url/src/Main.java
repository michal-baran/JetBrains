import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        website = website.substring(website.indexOf("?") + 1);
        String[] parameters = website.split("&", -1);

        String password = "";


        for (String parameter : parameters) {
            String[] temp = parameter.split("=", -1);
            if (temp[0].equals("pass")) {
                password = temp[1];
            }
            if (temp[1].isEmpty()) {
                System.out.println(temp[0] + " : " + "not found");
            } else {
                System.out.println(temp[0] + " : " + temp[1]);
            }
        }
        if (!password.isEmpty()) {
            System.out.println("password : " + password);
        }
    }
}