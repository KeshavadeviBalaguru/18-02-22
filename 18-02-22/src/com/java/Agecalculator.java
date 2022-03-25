package com.java;



public class Agecalculator {

	public static void main(String[] args) {
		age(18,2,2022,19,7,1999);
	}
	public static void age(int date,int month,int year,int birthdate,int birthmonth, int birthyear)
	{
		int calcdate=0;
		int calcmonth=0;
		int calcyear=0;
		int months[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if (birthdate>date)
		{
			date=months[date]+date;
			month-=1;
		}
		if (birthmonth>month)
		{
			year-=1;
			month+=12;
		}
		
		calcdate=date - birthdate;
		calcmonth=month- birthmonth;
		calcyear=year - birthyear;
		System.out.println("You are"+calcdate+ "days,"+calcmonth+"months and"+calcyear+"years old");
	}

}
