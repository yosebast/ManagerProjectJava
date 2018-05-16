package com.melo.manager.today.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.melo.manager.itoday.CalculaFecha;

@Component
public class CalculaFechaImpl implements CalculaFecha {

	@Override
	public Date obtieneFecha() {
		
			Date fecha =  Calendar.getInstance().getTime();
			
			return fecha;
	
	}
	

	
	

}
