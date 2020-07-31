public class Main {

    public static void main(String[] args) {
        int count = 0;
        Secret[] constants = Secret.values();

        for (Secret value : constants) {
            if (value.toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, STARSHIP, STA, FUN// ...
}
