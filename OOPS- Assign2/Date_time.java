package Assign_2;
/*
//a. dd/mm/yyyy (e.g., 31/12/2022)
//b. mm/dd/yyyy (e.g., 12/31/2022)
//c. yyyy/mm/dd (e.g., 2022/12/31)
import java.util.Date;
import java.text.SimpleDateFormat;


		public class Date_time {
		public static void main(String[] args) {
		Date date = new Date( );
		
		//SimpleDateFormat sdf = new SimpleDateFormat( "dd/mm/yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat( "mm/dd/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-mm-dd");
		
		
		
		String strDate = sdf.format(date);
		System.out.println( strDate );
		}
}
*/

//The program should be able to convert times between the following formats:
//a. hh:mm:ss (e.g., 23:59:59)
//b. hh:mm:ss a (e.g., 11:59:59 PM)
//c. hh:mm (e.g., 23:59)
/*
import java.time.LocalTime;
public class Date_time {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        //LocalDateTime ldt = LocalDateTime.now();
		    int hour = lt.getHour();
		    int minute = lt.getMinute();
		    int sec = lt.getSecond();
		    System.out.println(hour+" : "+minute+" :"+sec);
		    }
    }
*/
//The program should be able to convert dates and times between the following
//formats:
//a. dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59)
//b. mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM)
//c. yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59)
//2.
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Date_time {  
  public static void main(String[] args) {  
    LocalDateTime datetime1 = LocalDateTime.now();  
   // DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    //DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy HH:mm:ss");
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
    String formatDateTime = datetime1.format(format);   
    System.out.println(formatDateTime);    
  }  
}





