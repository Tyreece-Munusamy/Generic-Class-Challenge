package com.company;

public class Main {
	// created a simple program to rank teams in a league
	// salvaged code from previous parts of the course
	// 2020/10/01 players removed

    public static void main(String[] args) {
    	// players were removed for simplicity -> refer to file: 'Our Generic Class'
	 Team soccerTeam = new Team("Liverpool");
	 Team soccerTeam2 = new Team("West Ham");
	 Team soccerTeam3 = new Team("Arsenal");

	 League<Team> league = new League<>("league1");
	 league.addTeam(soccerTeam);
	 league.addTeam(soccerTeam2);
	 league.addTeam(soccerTeam3);
	 league.playMatch(soccerTeam,soccerTeam2,10,13);
	 league.playMatch(soccerTeam2,soccerTeam,5,6);
	 league.playMatch(soccerTeam3,soccerTeam2,9,6);
	 league.playMatch(soccerTeam3,soccerTeam,6,9);
	 league.playMatch(soccerTeam3,soccerTeam,6,9);
	 league.sortTeams();
    }
}
