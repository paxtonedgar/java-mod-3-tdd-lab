import java.util.ArrayList;

public class FizzBuzz {

    private String fizzBuzzString(String str) {
        if (str == null) return null;
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        if (str.startsWith("f"))  return "Fizz";
        if (str.endsWith("b")) return "Buzz";
        return str;
        }

    public ArrayList<String> inputRecur(ArrayList<String> input){
        ArrayList<String> transInput = new ArrayList<>();
        input.forEach(str -> {
            String transStr = fizzBuzzString(str);
            transInput.add(transStr);
        });
        return transInput;
    }


}
