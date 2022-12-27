package com.ust.conInj;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach {

	
	
  public CricketCoach() {

    System.out.println("Constructor: 0-param constructor call of CricketCoach");

  }

  public String getDailyWorkout() {

    return "4 hours of Practice";

  }

}