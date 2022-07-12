import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("fightclub", "yomomma", "bimbo", "fugettaboutit"));
        FizzBuzz f = new FizzBuzz();
        ArrayList<String> output = f.inputRecur(input);
    }
}
