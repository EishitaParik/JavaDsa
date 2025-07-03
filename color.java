import java.util.Random;

public class HexColorGenerator {
    public static String getRandomColor() {
        Random rand = new Random();
        int color = rand.nextInt(0xffffff + 1);
        return String.format("#%06X", color);
    }

    public static void main(String[] args) {
        System.out.println(getRandomColor()); // e.g., #3FA2BC
    }
}
