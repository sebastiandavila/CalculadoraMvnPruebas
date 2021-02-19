package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Number div(double number1, double number2) {
        logger.info( "dividend {} / {}", number1, number2 );
        try {
            return number1 / number2;
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
        return null;
    }

    public Long resta(Long number1, Long number2) {
        logger.info( "Rest {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicar(Long number1, Long number2) {
        logger.info( "Multiplier {} * {}", number1, number2 );
        return number1 * number2;
    }

}
