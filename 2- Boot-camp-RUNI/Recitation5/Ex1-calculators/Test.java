public class Test {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator num1 op num2 [op num3 ...]");
            return;
        }
        double result = Double.parseDouble(args[0]);
        String operator = null;
        
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("+") || args[i].equals("-") || args[i].equals("*") || args[i].equals("/")) {
                operator = args[i];
            } else {
                double num = Double.parseDouble(args[i]);
                if (operator != null) {
                    switch (operator) {
                        case "+":
                            result += num;
                            break;
                        case "-":
                            result -= num;
                            break;
                        case "*":
                            result *= num;
                            break;
                        case "/":
                            result /= num;
                            break;
                    }
                    operator = null;
                }
            }
        }

        System.out.println(result);
    }
}
