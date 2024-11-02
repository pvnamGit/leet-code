package queue.number_of_recent_calls;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
  Queue<Integer> calls;

  public RecentCounter() {
    this.calls = new LinkedList<>();
  }

  public int ping(int t) {
    calls.add(t);
    while (calls.peek() < t - 3000) {
      calls.poll();
    }
    return calls.size();
  }
}
