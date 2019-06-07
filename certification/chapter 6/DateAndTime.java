import java.time.*;
import java.util.*;
import java.text.*;
import java.time.format.*;
import java.time.temporal.*;
class DateAndTime{
	public static void main(String[] args) {
//GET CURRENT TIME
	LocalTime time = LocalTime.now(); 
	System.out.println(time);
//GET CURRENT DATE
	LocalDate date = LocalDate.now();
	System.out.println(date);
//GET CURRENT DATEANDTIME 
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println(dateTime);
//GET FORMATTED DATE AND TIME
	DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
    String formatedDateTime = dateTime.format(format);
    System.out.println("\n"+formatedDateTime);
//GET MONTH DAY SECONDS AND WEEK OF A PARTICULAR DATE
    Month month = dateTime.getMonth();                               
    int day = dateTime.getDayOfMonth();                              
    int seconds = dateTime.getSecond();                              
    DayOfWeek week = LocalDate.parse("2019-04-24").getDayOfWeek();
    System.out.println(" "+month+"  "+day+"  "+seconds+"  "+week);
//Create a specific Date:
    LocalDate date2 = LocalDate.of(2019,1,26);                      
    LocalDate date3 = LocalDate.parse("2019-01-26");
    System.out.println(date2+"\n"+date3); 
//Add a day:
    LocalDate tomorrow = LocalDate.now().plusDays(1);
    System.out.println("tomorrow is :"+tomorrow);
//Minus a Month:
    LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
    System.out.println(previousMonthSameDay);
	}
}
 