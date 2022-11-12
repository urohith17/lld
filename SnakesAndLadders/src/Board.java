import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.*;

public class Board {
    List<Cell> board;
    Deque<Player> players = new ArrayDeque<>();
    Dice dice;
    Map<Integer,Integer> jumpMap = new HashMap<>();
    Board(int size,int playerCount,int diceCount){
            board = new ArrayList<>(size*size);
            createPlayers(playerCount);
            dice = new Dice(diceCount);
    }
    public void createPlayers(int count) {
            for(int i=0;i<count;i++){
                Player player = new Player('P'+String.valueOf(i));
                players.push(player);
            } 
    }

    public void addJumpPoint (int start,int end) throws Exception{
        if(start == end){
            throw new Exception("jump loop found");
        }else{
            if(jumpMap.containsKey(start)){
                throw new Exception("jump already present");
            }
            else if(jumpMap.containsKey(end) && jumpMap.get(end)==start){
                throw new Exception("jump loop");
            }else{
                jumpMap.put(start, end);
            }
        }
    }


}
