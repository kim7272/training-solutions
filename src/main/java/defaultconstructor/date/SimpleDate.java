package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;


    public void setDate(int year, int month, int day){
        if (!isCorrect(year, month, day)){
            throw new IllegalArgumentException
                    ("One or more given parameter cannot be applied!" + " " + year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    private boolean isCorrect(int year, int month, int day){
        return (year > 1990 &&  month <= 12 && day <= calculateMonthLength(year, month));
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0);
    }

    private int calculateMonthLength(int year, int month){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        else if (month == 4 || month == 6|| month == 9 || month == 11){
            return 30;
        }
        else {
            if (isLeapYear(year)){
             return 29;
            }
            else {
              return 28;
            }
        }
    }
}
