import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int operand1 = nextInt();
        char operation = getOperation();
        int operand2 = nextInt();
        int result = calc(operand1,operation,operand2);
        System.out.println("Результат операции: "+result);
    }

    public static int nextInt(){
        System.out.println(" Введите число:");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, char operation, int operand2){
        int result;
        switch (operation){
            case '+':
                result = operand1+operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;
            case '-':
                result = operand1-operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;
            case '*':
                result = operand1*operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;
            case '/':
                result = operand1/operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, getOperation(), operand2);
        }
        return result;
    }
}
dssfd