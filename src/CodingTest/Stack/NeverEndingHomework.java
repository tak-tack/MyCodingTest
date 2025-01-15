package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/*
성애는 이번 학기에 전공을 정말 많이 듣는다. 이로 인해 거의 매일을 과제를 하면서 보내고 있다. 그런데도 과제가 줄어들 기미가 보이지 않는데,
바로 분단위로 과제가 추가되고 있기 때문이다. 다행히 과제 제출 기한은 학기가 끝날 때까지이다. 너무나도 많은 과제를 하다가 미쳐버린 성애는 아래와 같은 규칙으로 과제를 해 나가고 있다.

1. 과제는 가장 최근에 나온 순서대로 한다. 또한 과제를 받으면 바로 시작한다.
2. 과제를 하던 도중 새로운 과제가 나온다면, 하던 과제를 중단하고 새로운 과제를 진행한다.
3. 새로운 과제가 끝났다면, 이전에 하던 과제를 이전에 하던 부분부터 이어서 한다. (성애는 기억력이 좋기 때문에 아무리 긴 시간이 지나도 본인이 하던 부분을 기억할 수 있다.)
4. 성애는 과제를 받자마자 이 과제가 몇 분이 걸릴지 정확하게 알 수 있고, 성애가 제출한 과제는 무조건 만점을 받는다.

성애는 이번 학기에 자기가 받을 과제 점수를 예상해보고 싶다. 하지만 과제 점수를 예상하는 지금도 과제가 추가되고 있기에 여유를 부릴 수가 없다. 여러분이 성애가 받을 과제 점수를 구해주자!

* 입력
첫째 줄에 이번 학기가 몇 분인지를 나타내는 정수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
두번째 줄부터 N줄 동안은 학기가 시작하고 N분째 에 주어진 과제의 정보가 아래의 두 경우 중 하나로 주어진다.

1 A T: 과제의 만점은 A점 이고, 성애가 이 과제를 해결하는데 T분이 걸린다. A와 T는 모두 정수이다.
 (1 ≤ A ≤ 100, 1 ≤ T ≤ 1,000,000)

0: 해당 시점에는 과제가 주어지지 않았다.

* 출력
성애가 받을 과제 점수를 출력한다.
 */
public class NeverEndingHomework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 이번 학기가 몇 분인지를 나타내는 정수 N
        Stack<Integer> st = new Stack<>();
        Stack<Integer> timeSt =  new Stack<>();
        int score = 0;

        for(int i = 0; i < N+1; i++){ // N줄 동안은 학기가 시작
            String str = br.readLine();
            if(Integer.parseInt(str.substring(0,1)) == 1){
                timeSt.push(i);
            int[] tempArray = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < tempArray.length; j++){
                st.push(tempArray[j]);
                }
            }
            if(i == sum(st.peek(),timeSt.peek())){ // i 는 시간 // st.peek() + timeSt.peek()
                timeSt.pop();
                st.pop(); // T 분 빼고
                score += st.pop(); // A 빼서 점수 더하기
                st.pop();
            }


        }
        System.out.println(score);

    }
    public static int sum(int a, int b){
        return  a+b;
    }

}
