package com.keduit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test_날짜 {

	public static void main(String[] args) {
		Calendar date =Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("y년M월d일");
		SimpleDateFormat now = new SimpleDateFormat("h시m분s초");
		System.out.println(today.format(date.getTime()));
		  System.out.println(now.format(date.getTime()));
	}

}
