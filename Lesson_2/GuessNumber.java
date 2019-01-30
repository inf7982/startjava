public class GuessNumber {
    public void method(String playerName, int randomNumber, int userNumber) {
        do {
            if (userNumber > randomNumber) {
                System.out.println(playerName + ", введенное вами число " + userNumber + " больше того, что загадал компьютер");
                userNumber--;
            } else if (userNumber < randomNumber){
                System.out.println(playerName + ", введенное вами число " + userNumber + " меньше того, что загадал компьютер");
                userNumber++;
            }
            userNumber = (randomNumber - userNumber) / 2 + userNumber;
        }
        while (randomNumber != userNumber);
        System.out.println(playerName + ", Вы угадали число " + userNumber);
    }
}