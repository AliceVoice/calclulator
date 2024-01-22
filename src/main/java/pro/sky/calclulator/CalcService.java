package pro.sky.calclulator;

import org.springframework.stereotype.Service;


@Service
public class CalcService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String addOperation(int num1, int num2) {
        int total = num1 + num2;
        return num1 + " + " + num2 + " = " + total;
    }

    public String minusOperation(int num1, int num2) {
        int total = num1 - num2;
        return num1 + " - " + num2 + " = " + total;
    }

    public String multiplyOperation(int num1, int num2) {
        int total = num1 * num2;
        return num1 + " * " + num2 + " = " + total;
    }

    public String divideOperation(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль");
        }
        int total = num1 / num2;
        return num1 + " / " + num2 + " = " + total;
    }

}
