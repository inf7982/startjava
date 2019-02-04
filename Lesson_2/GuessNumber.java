import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        player1.setNumber(-1);
        player2.setNumber(-1);
        
        while (randomNumber != player1.getNumber() && randomNumber != player2.getNumber()) {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setNumber(scan.nextInt());
            suggestPlayer(player1);
            if (player1.getNumber() == randomNumber) {
                break;
            }
            System.out.print(player2.getName() + ", введите число: ");
            player2.setNumber(scan.nextInt());
            suggestPlayer(player2);
        }
    }

    public void suggestPlayer(Player player) {
        if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", Вы угадали число " + player.getNumber());
            System.out.println("Победил игрок по имени " + player.getName());
        }
    }
}