import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for(int i = 1; i <= 3; i++) {
            System.out.println("Введите название " + i + " автомобиля");
            String name  = scanner.nextLine();

            while(true) {
                System.out.println("Введите скорость " + i + " автомобиля");
                int speed = scanner.nextInt();
                if (speed > 0 && speed <=250) {
                    Automobile automobile = new Automobile(name, speed);
                    race.leader(automobile);
                    break;
                } else System.out.println("Скорость автомобиля должна быть больше 0 и не больше 250");
            }
        }
        System.out.println("Победитель гонки  " + race.winnerName);
    }
}
class Automobile {
    String name;
    int speed;

    Automobile (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}
class Race {
    String winnerName = "";
    int distance = 0;
    public void leader (Automobile automobile) {
        int newDistance = 24 * automobile.speed;
        if (newDistance > distance) {
            distance = newDistance;
            winnerName = automobile.name;
        }
    }
}
