import java.text.Format;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date;  
public class GetDayName  
{  
public static void main(String args[]) throws Exception   
{  
//returns a Calendar object whose calendar fields have been initialized with the current date and time  
Calendar cal = Calendar.getInstance();  
//creating a constructor of the SimpleDateFormat class  
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
//getting current date  
System.out.println("Today's date: "+sdf.format(cal.getTime()));  
//creating a constructor of the Format class  
//displaying full-day name  
Format f = new SimpleDateFormat("EEEE");  
String str = f.format(new Date());  
//prints day name  
System.out.println("Day Name: "+str);  
}  
}  