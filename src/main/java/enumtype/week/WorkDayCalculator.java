package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkDayCalculator {

  private Day nextDay(Day day){
      if (day.ordinal() == Day.values().length-1){
      return day.MONDAY;}
      else {
      return Day.values()[day.ordinal()+1];
      }
  }
    public  List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> types = new ArrayList<>();
        Day d = firstDay;
        for (int i = firstDay.ordinal(); i <= numberOfDays; i++) {
            types.add(d.getDayType());
            d = nextDay(d);
        }
        return types;
    }
  }
