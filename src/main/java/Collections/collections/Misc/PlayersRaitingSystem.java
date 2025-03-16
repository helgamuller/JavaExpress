package Collections.collections.Misc;
//Вам нужно хранить список игроков с их рейтингами, чтобы быстро находить игрока с самым высоким рейтингом.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PlayersRaitingSystem {
private Queue<Player> raiting;
     public PlayersRaitingSystem(){
         raiting = new PriorityQueue<Player>(Comparator.comparingInt((Player p)->p.getRank()).reversed());
     }
     private void addPlayer(String name, Integer rank) {
         raiting.add(new Player(name, rank));
     }
    private void findTopPlayer(){
         raiting.peek();
        System.out.println("The best is " + raiting.peek());
    }

    public static void main(String[] args) {
        PlayersRaitingSystem raitingSystem = new PlayersRaitingSystem();
        raitingSystem.addPlayer("Ivnoff", 22);
        raitingSystem.addPlayer("Shumi", 100);
        raitingSystem.findTopPlayer();

    }

}
class Player{
    private String name;
    private Integer rank;

    public Player(String name, Integer rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "has raiting " + rank;
    }

    public Integer getRank() {
        return rank;
    }
}

