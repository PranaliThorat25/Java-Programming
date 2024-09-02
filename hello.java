import java.time.DayOfWeek;
import java.time.LocalDate;
class hello{
public static void main(String[] args) {
String userInput= args[0];
String[] datePart = userInput.split("/");
LocalDate date = LocalDate.of(Integer.parseInt(datePart[2]),
Integer.parseInt(datePart[1]), Integer.parseInt(datePart[0]));
DayOfWeek dayOfWeek = date.getDayOfWeek();
System.out.println("The day at date "+userInput+" is "+dayOfWeek);
}
}
