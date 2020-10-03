package com.company;

public class Main {
	// created a simple program to rank teams in a league
	// salvaged code from previous parts of the course
	// 2020/10/01 players removed

    public static void main(String[] args) {
    	// players were removed for simplicity -> refer to file: 'Our Generic Class'
	 Team liverpool = new Team("Liverpool");
	 Team westHam = new Team("West Ham");
	 Team arsenal = new Team("Arsenal");
	 Team manchesterUnited = new Team("Man U");

	 League<Team> league = new League<>("The League");
	 league.addTeam(liverpool);
	 league.addTeam(westHam);
	 league.addTeam(arsenal);
	 league.addTeam(manchesterUnited);
//	 league.addTeam(manchesterUnited);
		// tested
	 league.playMatch(liverpool,westHam,10,13);
	 league.playMatch(westHam,liverpool,5,6);
	 league.playMatch(arsenal,westHam,9,6);
	 league.playMatch(arsenal,liverpool,6,9);
	 league.playMatch(arsenal,liverpool,6,9);
	 league.playMatch(manchesterUnited,liverpool,6,9);
	 league.playMatch(arsenal,manchesterUnited,6,5);
	 league.sortTeams();
    }
}
