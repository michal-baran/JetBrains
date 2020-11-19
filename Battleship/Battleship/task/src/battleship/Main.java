package battleship;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
//       Board board = new Board();
//        board.startGame();
        Class boardClass = Board.class;
     //   Class intClass = int.class;
//        Class instanceClass = board.getClass();
        Class forName = Class.forName("java.lang.String");
        Class floatArrayClass = Class.forName("[F");


    }
}