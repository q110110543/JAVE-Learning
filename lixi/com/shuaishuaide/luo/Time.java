package com.shuaishuaide.luo;

public class Time {
	int year;
	
	int month;
	
	int day;

	public Time() {
		
		this(1970,1,1);
		
	}

	public Time(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void print(){
		
		System.out.println(year + "Äê" + month + "ÔÂ" + day + "ÈÕ");
	}
}
