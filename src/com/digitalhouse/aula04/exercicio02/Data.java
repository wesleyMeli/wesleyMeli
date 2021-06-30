/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio02;

public class Data {
	
	static final int MONTH_LENGTH[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 0-based
	
	static final int LEAP_MONTH_LENGTH[] = {31,29,31,30,31,30,31,31,30,31,30,31}; // 0-based
	
	static final int MIN_DAY = 01;
	
	static final int MIN_MONTH = 01;
	
	static final int MIN_YEAR = 1970;
	
	static final int MAX_MONTH = 12;
	
	private int day = MIN_DAY;
	private int month = MIN_MONTH;
	private int year = MIN_YEAR;

	public Data() {
		// TODO Auto-generated constructor stub
	}
	
	public Data(int day, int month, int year) throws Exception {
		super();
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) throws Exception {
		verifyDay(day);
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws Exception {
		verifyMonth(month);
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws Exception {
		verifyYear(year);
		this.year = year;
	}
	
	private void verifyDay(int day) throws Exception{
		if(day < MIN_DAY) throw new IncorrectDataException(" O dia não pode ser menor que "+MIN_DAY);
		
		if((this.year%100 == 0 && this.year%400 == 0 || this.year%100 != 0 && this.year%4 == 0) && day > LEAP_MONTH_LENGTH[this.month - 1 ]) 
			throw new IncorrectDataException(" O dia não pode ser maior que "+LEAP_MONTH_LENGTH[this.month - 1 ]);
		
		if(this.year%4 != 0 && day > MONTH_LENGTH[this.month - 1 ] ) throw new IncorrectDataException(" O dia não pode ser maior que "+MONTH_LENGTH[this.month - 1 ]);
	}

	private void verifyMonth(int month) throws Exception{
		if(month < MIN_MONTH) throw new IncorrectDataException(" O mês não pode ser menor que "+MIN_MONTH);
		if(month > MAX_MONTH) throw new IncorrectDataException(" O mês não pode ser maior que "+MAX_MONTH);
	}
	
	private void verifyYear(int year) throws Exception{
		if(year < MIN_YEAR) throw new IncorrectDataException(" O ano não pode ser menor que "+MIN_YEAR);
	}

	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
}
