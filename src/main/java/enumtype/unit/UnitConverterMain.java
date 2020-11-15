package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConverter unitConverter = new UnitConverter();
        BigDecimal length = new BigDecimal(21);

        BigDecimal number = unitConverter.convert(length,LengthUnit.INCH, LengthUnit.FOOT);
        System.out.format(number.setScale(4).toString());
    }
}

