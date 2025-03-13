package com.company;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <FootballPlayer> crows = new Team<>("Crows");
        crows.addPlayer(joe);

        System.out.println(crows.numPlayers());

        Team <BaseballPlayer> baseballTeam = new Team<>("Cubs");
        baseballTeam.addPlayer(pat);

        Team <SoccerPlayer> soccerTeam = new Team<>("Manchester United");
        soccerTeam.addPlayer(beckham);

        Team <FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team <FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team <FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(crows, 3, 8);
        crows.matchResult(fremantle, 2, 1);
//        crows.matchResult(baseballTeam,1, 1);

        System.out.println("Rankings: ");
        System.out.println(crows.getName() + ": " + crows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(crows.compareTo(melbourne));
        System.out.println(crows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(crows));
        System.out.println(melbourne.compareTo(fremantle));

//        ArrayList <Team> teams;
//        Collections.sort(teams);
    }
}