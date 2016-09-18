import java.util.Calendar;
public class Dates
{
   public static void main(String[] args)
   {
       Calendar cal = Calendar.getInstance();
       System.out.println("\nIt is now " + cal.getTime());
       cal.set(Calendar.YEAR, 2016);
       System.out.println("\nDate is now " + cal.getTime());
       
       String fields = "\nYear:\t\t\t" + cal.get(Calendar.YEAR);
       fields += "\nMonth:\t\t\t" + cal.get(Calendar.MONTH);
       fields += "\nDay of the month:\t";
       fields += cal.get(Calendar.DAY_OF_MONTH + 1);
       fields += "\nDay of the Week:\t";
       fields += cal.get(Calendar.DAY_OF_WEEK);
       fields += "\nDay of the year:\t";
       fields += cal.get(Calendar.DAY_OF_YEAR);
       fields += "\nWeek of the Year:\t" + cal.get(Calendar.WEEK_OF_YEAR);
       fields += "\nWeek of the Month:\t" + cal.get(Calendar.WEEK_OF_MONTH);
       fields += "\nDay of Week in Month:\t" + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
       fields += "\nHour:\t\t\t" + (cal.get(Calendar.HOUR)+1);
       fields += "\nAM(0) or PM(1):\t\t" + cal.get(Calendar.AM_PM);
       fields += "\nHour (0-23):\t\t" + cal.get(Calendar.HOUR_OF_DAY);
       fields += "\nMinute:\t\t\t" + cal.get(Calendar.MINUTE);
       fields += "\nSecond:\t\t\t" + cal.get(Calendar.SECOND);
       System.out.println(fields);
   }
}
