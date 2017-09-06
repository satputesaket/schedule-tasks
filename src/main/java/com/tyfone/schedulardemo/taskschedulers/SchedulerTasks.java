package com.tyfone.schedulardemo.taskschedulers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class SchedulerTasks {

	private static final Logger LOGGER = LoggerFactory.getLogger(SchedulerTasks.class); 
	
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT= new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime(){
		LOGGER.info("The time is now {}"+SIMPLE_DATE_FORMAT.format(new Date()));
		System.out.println("The time is now {}"+SIMPLE_DATE_FORMAT.format(new Date()));
	}
}
