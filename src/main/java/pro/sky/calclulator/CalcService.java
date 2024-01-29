package pro.sky.calclulator;

import org.springframework.stereotype.Service;

    @Service
public class CalcService {

    public int addOperation(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    public int minusOperation(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }

    public int multiplyOperation(int num1, int num2) {
        int total = num1 * num2;
        return total;
    }

    public int divideOperation(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль");
        }
        int total = num1 / num2;
        return total;
    }
}
