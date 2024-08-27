package queue.implement_stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyStack {
  private Queue<Integer> queue;

  public MyStack() {
    if (this.queue == null) this.queue = new LinkedList<>();
  }

  public void push(int x) {
    queue.add(x);
    for (int i = 1; i < queue.size(); i++) {
      queue.add(queue.remove());
    }
  }

  public int pop() {
    return queue.remove();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }
}
