package com.melo.manager.today.impl;

import java.util.Calendar;
import java.util.Date;

public class CalculaFechaImpl {
	
	public Date obtieneFecha(){
		Date fecha =  Calendar.getInstance().getTime();
		
		return fecha;
	}
	
	

}
