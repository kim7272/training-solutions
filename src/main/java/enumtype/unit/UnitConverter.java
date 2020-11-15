package enumtype.unit;

import java.math.BigDecimal;

public class UnitConverter {

    BigDecimal length  = BigDecimal.ZERO;
    BigDecimal targetMillimeterValue  = BigDecimal.ZERO;
    BigDecimal sourceValue = BigDecimal.ZERO;


    BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target){
        int sourceInMillimeter = source.getInMillimeter();
        targetMillimeterValue = length.multiply(new BigDecimal(sourceInMillimeter));
        int targetInMillimeter = target.getInMillimeter();
        sourceValue = targetMillimeterValue.divide(new BigDecimal(targetInMillimeter));
        return sourceValue;}
}
