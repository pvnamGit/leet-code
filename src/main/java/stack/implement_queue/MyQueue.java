package stack.implement_queue;

import java.util.Stack;

public class MyQueue {
        private Stack<Integer> stack;
        public MyQueue() {
            if (this.stack == null)
                this.stack = new Stack<>();
        }

        public void push(int x) {
            this.stack.push(x);
            for (int i = 0; i < this.stack.size(); i++) {
                this.stack.add(i, this.stack.pop());
            }
        }

        public int pop() {
            return this.stack.remove(0);

        }

        public int peek() {
            return this.stack.peek();
        }

        public boolean empty() {
            return this.stack.empty();
        }
}
