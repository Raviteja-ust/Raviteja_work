package com.ust.conInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CricketTeam {

	// dependent class

	private CricketCoach teamCoach;

	

	@Autowired

	public CricketTeam(CricketCoach coach) {

		System.out.println("Constructor: parameterized constructor call Cricket Team");

		this.teamCoach = coach;

	}

	public String getInstruction() {

		return "Coach Instruction:" + teamCoach.getDailyWorkout();

	}

}
