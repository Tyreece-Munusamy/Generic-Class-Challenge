package com.company;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Team> {
    private final String name;
    List<Team> league = new ArrayList<>();
    Team spectator = new Team("Spectator");
    // allow team functionality to be used in class

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addTeam(T team) {
        if (!league.contains(team)) {
            league.add(team);
        } else {
            System.out.println("Team is already in a league");
        }
    }
    public void sortTeams() {
//        Collections.sort(league);
        int rank = 1;
//        int gamesPlayedInLeague = 0;
        System.out.println("\n" + "Team ranks in " + this.getName());
        for(Team teams: league) {
//            teams.played += gamesPlayedInLeague;
            System.out.println(rank++ + "." + " " + teams.getName() + " " + teams.teamRanking() + " points" + " with " + teams.totalGoalsScored + " goals");
        }
        System.out.println(" Games Played in " + this.getName() + ": " + spectator.played/2);
    }
    public void playMatch(Team homeTeam,Team awayTeam,int homeTeamScore,int awayTeamScore) {
        if(league.contains(homeTeam) && league.contains(awayTeam)) {
            spectator.playMatch(homeTeam, awayTeam, homeTeamScore, awayTeamScore);
        } else {
            System.out.println("Error: team(s) not in league");
        }
    }
}
