package CodingTest.Level0.PCCE;

/*
각 칸마다 색이 칠해진 2차원 격자 보드판이 있습니다. 그중 한 칸을 골랐을 때,
위, 아래, 왼쪽, 오른쪽 칸 중 같은 색깔로 칠해진 칸의 개수를 구하려고 합니다.
보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트 board 와 고른 칸의 위치를 나타내는 두 정수 h, w가 주어질 때
board[h][w]와 이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 개수를 return 하도록 solution 함수를 완성해 주세요.
이웃한 칸들 중 몇 개의 칸이 같은 색으로 색칠되어 있는지 확인하는 과정은 다음과 같습니다.

1. 정수를 저장할 변수 n을 만들고 board 의 길이를 저장합니다.
2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장합니다.
3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장합니다.
4. 반복문을 이용해 i 값을 0부터 3까지 1 씩 증가시키며 아래 작업을 반복합니다.
    4-1. 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고 각각 h + dh[i], w + dw[i]를 저장합니다.
    4-2. h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
        4-2-a. board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
5. count의 값을 return합니다.

board : 보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트
h,w : 고른 칸의 위치를 나타내는 두 정수
answer : 같은색 색깔(count)
 */
public class 이웃한칸 {
    public static void main(String[] args) {
        이웃한칸 n = new 이웃한칸();
        String[][] param = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        System.out.println(
        n.solution(param,1,1)
        );
    }
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String str = board[h][w];
        int[] dh= {0, 1, -1, 0};
        int[] dw= {1, 0, 0, -1};
        while(str.equals(board[h][w-1]) || str.equals(board[h-1][w]) || str.equals(board[h][w+1]) || str.equals(board[h+1][w]))
        {
            if(board.length == h || board[0].length == w){
                break;
            }
            h++;
            w++;
            answer++;
        }
        return answer;
    }
}
