package com.melo.manager.action;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BancomerDateImpl implements BancomerDate {

	@Override
	public Date CloseBancomer() {
		 Date getTime = Calendar.getInstance().getTime();	
		return getTime;
	}

	

}
