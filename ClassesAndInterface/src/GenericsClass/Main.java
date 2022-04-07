package GenericsClass;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer=new FootballPlayer("Joe");
        BaseballPlayer baseballPlayer=new BaseballPlayer("Pat");
        SoccerPlayer soccerPlayer=new SoccerPlayer("Beckham");

        Team<FootballPlayer> team1=new Team<>("A");
        team1.addPlayer(footballPlayer);
        System.out.println(team1.numPlayers());

        Team<BaseballPlayer> team2=new Team<>("B");
        team2.addPlayer(baseballPlayer);
        System.out.println(team2.numPlayers());

        Team<SoccerPlayer> team3=new Team<>("C");
        team3.addPlayer(soccerPlayer);
        System.out.println(team3.numPlayers());

//        Team<String> stringTeam=new Team<String>("S");
//        stringTeam.addPlayer("NO ONE");
        //this shows error because we restrict the Team via extending the Player
        // and we can also remove (Player) from this ((Player) player).getName()
    }
}
