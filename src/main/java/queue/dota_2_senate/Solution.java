package queue.dota_2_senate;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public String predictPartyVictory(String senate) {
    Queue<Integer> rQueue = new LinkedList<>();
    Queue<Integer> dQueue = new LinkedList<>();

    for (int index = 0; index < senate.length(); index++) {
      if (senate.charAt(index) == 'R') rQueue.add(index);
      else dQueue.add(index);
    }

    while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
      int rIndex = rQueue.poll();
      int dIndex = dQueue.poll();

      if (rIndex < dIndex) rQueue.add(rIndex + senate.length());
      else dQueue.add(dIndex + senate.length());
    }
    return rQueue.isEmpty() ? "Dire" : "Radiant";
  }
}
