package javatpoint;

import java.util.*;
import java.text.*;

public class DatetoString{
	public static void main(String[] args) {
		Date date=Calendar.getInstance().getTime();
		DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate=dateFormat.format(date);
		System.out.println("converted String:"+strDate);
	}
}