package org.blogdemo.fbdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import facebook4j.User;

public class BirthdayCounter {
	

	public int countBirthday(User user){
		
		if(user == null || user.getBirthday() == null){
			return -1;
		}
		
		String birthday = user.getBirthday();
		
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); 
	    SimpleDateFormat yf = new SimpleDateFormat("yyyy");
	    Date date = new Date();
	    	    
	    int endYear = Integer.parseInt(yf.format(date));
	    String birthdayTempString = birthday.substring(0, birthday.length()-4)+endYear;
	    
	    Date birthdayThisYear = null;
	    Date birthdayNextYear = null;
	   
	    try {
	    	birthdayThisYear = sdf.parse(birthdayTempString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    //Determine we should calculate from this year or next year
	    if(birthdayTempString.equals(sdf.format(date))){
	    	return 0;
	    }else if(birthdayThisYear.before(date)){
	    	birthdayTempString = birthday.substring(0, birthday.length()-4) + (endYear+1);
	    	try {
				birthdayNextYear = sdf.parse(birthdayTempString);
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    }else{
	    	birthdayTempString = birthday.substring(0, birthday.length()-4) + (endYear-1);
	    	birthdayNextYear = birthdayThisYear;
	    }
	    
		
	    int dayDiff = daysBetween(date,birthdayNextYear);
		return dayDiff;
	}
	
	private int daysBetween(Date d1, Date d2){
		return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
	
}
