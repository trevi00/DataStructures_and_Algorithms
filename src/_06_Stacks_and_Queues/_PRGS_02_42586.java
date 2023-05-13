package _06_Stacks_and_Queues;

import java.util.PriorityQueue;
import java.util.Queue;


public class _PRGS_02_42586 { // 기능개발
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int day = 0;
        int index = 0;

        Queue<Integer> queue1 = new PriorityQueue<>();
        Queue<Integer> queue2 = new PriorityQueue<>();
        // 93 30 55 | 1 30 5
        for (int i = 0; i < progresses.length; i++) {
            queue1.add(progresses[i]);
            queue2.add(speeds[i]);
        }
        while((queue1.peek() + day*queue2.peek()) < 100 && !queue1.isEmpty()){
            int ans = 0;
            int curr = queue1.peek() + day*queue2.peek();

            while(curr >= 100){
                queue1.remove();
                queue2.remove();
                ans++;
            }
            day++;
            if(ans>0){
                answer[index] = ans;
                index++;
            }
        }

        return answer;
    }
}
