package battleship;

import java.util.Scanner;

public class Board {
    private char[][] field = new char[10][10];
    private char[][] fog = new char[10][10];

    public Board() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '~';
                fog[i][j] = '~';
            }
        }
    }

    public void showBoard(char[][] field) {
        for (int c = -1; c < field.length; c++) {
            for (int r = -1; r < field[0].length; r++) {
                if (c < 0) {
                    System.out.print(" " + (r < 0 ? "" : r + 1));
                } else {
                    System.out.print(r < 0 ? (char) (65 + c) : " " + field[r][c]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void fillBoard() {
        Scanner scanner = new Scanner(System.in);
        int order = 5;
        while (order > 0) {
            Ship ship = Ship.findByOrder(order);
            int cells = ship.getSize();
            System.out.printf("Enter the coordinates of the %s (%d cells):\n", ship.getName(), cells);

            String[] input = scanner.nextLine().toUpperCase().split(" ");
            if (input[0].hashCode() > input[1].hashCode()) {
                String temp = input[0];
                input[0] = input[1];
                input[1] = temp;
            }

            int[] coord = new int[4];
            coord[0] = input[0].charAt(0) - 65;
            coord[1] = Integer.parseInt(input[0].substring(1)) - 1;
            coord[2] = input[1].charAt(0) - 65;
            coord[3] = Integer.parseInt(input[1].substring(1)) - 1;

            if (coord[2] - coord[0] != cells - 1 && coord[3] - coord[1] != cells - 1) {
                System.out.printf("Error! Wrong length of the %s! Try again:\n", ship.getName());
                continue;
            }
            if (coord[0] != coord[2] && coord[1] != coord[3]) {
                System.out.println("Error! Wrong ship location! Try again:\n");
                continue;
            }

            //Check if there is a ship placed near to given coordinates
            boolean accessible = true;
            for (int row = coord[0] == 0 ? 0 : coord[0] - 1; row <= (coord[2] == 9 ? 9 : coord[2] + 1); row++) {
                for (int col = coord[1] == 0 ? 0 : coord[1] - 1; col <= (coord[3] == 9 ? 9 : coord[3] + 1); col++) {
                    accessible = accessible && field[col][row] != 'O';
                }
            }
            if (accessible) {
                placeShip(coord);
            } else {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
                continue;
            }

            showBoard(field);
            order--;
        }
    }

    public void placeShip(int[] coord) {
        for (int row = coord[0]; row <= coord[2]; row++) {
            for (int col = coord[1]; col <= coord[3]; col++) {
                field[col][row] = 'O';
            }
        }
    }

    public void shotShip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Take a shot!");
        while (true) {
            String input = scanner.nextLine();
            int y = input.charAt(0) - 65;
            int x = Integer.parseInt(input.substring(1)) - 1;
            if (y >= 0 && y < 10 && x >= 0 && x < 10) {
                char letter = field[x][y];
                if (letter == 'O') {
                    field[x][y] = 'X';
                    fog[x][y] = 'X';
                    showBoard(fog);
                    System.out.println("You hit a ship!");
                    showBoard(field);
                } else {
                    field[x][y] = letter == '~' ? 'M' : letter;
                    fog[x][y] = letter == '~' ? 'M' : letter;
                    showBoard(fog);
                    System.out.println("You missed!");
                    showBoard(field);
                }
            } else {
                System.out.println("Error! You entered the wrong coordinates! Try again:\n");
            }
        }
    }

    public void startGame() {
        showBoard(field);
        fillBoard();
        System.out.println("The game starts!");
        showBoard(fog);
        shotShip();
    }
}