package pro.sky.calclulator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping (path = "/calculator")
    public String answerHello(){
        return calcService.hello();
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calcService.addOperation(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calcService.minusOperation(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calcService.multiplyOperation(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calcService.divideOperation(num1, num2);
    }
}
