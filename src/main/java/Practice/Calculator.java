package Practice;

import java.util.Optional;

public class Calculator {
    String input;
    public Calculator(String input) {
        this.input = input;
    }


    public int plus () {
        try {
            if (input == null) {
                return 0;
            }

            String [] inputArr = input.split(",|:");
            int result = 0;
            for (int i = 0; i < inputArr.length; i++) {
                result += Integer.parseInt(inputArr[i]);
            }
            return result;
        } catch (Exception e){
            return 0;
        }
    }
}
