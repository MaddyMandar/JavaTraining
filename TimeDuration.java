import java.time.Period;
 
public class TimeDuration
{
	public static void main(String[] args) {
		System.out.println("Hello World");
 
 
		System.out.println(calcDuration("10062019","27022020"));
 
	}
 
	public static double calcDuration(String date1,String date2){
 
	   int year = Integer.parseInt(date2.substring(4, 8)) - Integer.parseInt(date1.substring(4, 8)) ;
	   int months = Integer.parseInt(date2.substring(2, 4)) - Integer.parseInt(date1.substring(2, 4)) ;
 
	    Period period = Period.ofMonths( (year*12)+months ).normalized();
 
	    int y = period.getYears();
        int m = period.getMonths();
 
 
	   return  Double.parseDouble(y+"."+m);
 
	}
}
