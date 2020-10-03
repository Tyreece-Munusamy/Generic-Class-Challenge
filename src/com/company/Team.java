package com.company;
public class Team implements Comparable<Team> {
    private final String name;
    int won = 0;
    int tied = 0;
    int lost = 0;
    int played = 0;
    int totalGoalsScored = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void playMatchInterface(Team homeTeam,Team awayTeam,int homeTeamScore,int awayTeamScore){
        String message;
        if (homeTeamScore > awayTeamScore ) {
            homeTeam.won++;
            message = " beat ";
        } else if (awayTeamScore == homeTeamScore) {
            homeTeam.tied++;
            message = " drew with ";
        } else {
            homeTeam.lost++;
            message = " lost to ";
        }
        played++;
        homeTeam.totalGoalsScored += homeTeamScore;
        System.out.println(homeTeam.getName() + message +  awayTeam.getName());
    }

    public void playMatch(Team homeTeam,Team awayTeam,int homeTeamScore,int awayTeamScore) {
        System.out.println(homeTeam.getName() + " perspective: ");
        playMatchInterface(homeTeam,awayTeam,homeTeamScore,awayTeamScore);
        System.out.println(awayTeam.getName() + " perspective: ");
        playMatchInterface(awayTeam,homeTeam,awayTeamScore,homeTeamScore);
        System.out.println('\n');
    }
    public int teamRanking() {
        return ((totalGoalsScored * 2) + (won - lost)) + tied;
    }

    @Override
    public int compareTo(Team o) {
        return Integer.compare(o.teamRanking(),teamRanking());
    }
}
