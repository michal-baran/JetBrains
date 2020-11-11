import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] characters = reader.readLine().toCharArray();
        reader.close();

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i]);
        }
    }
}