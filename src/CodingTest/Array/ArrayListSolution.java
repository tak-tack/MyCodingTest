package CodingTest.Array;
// 리스트 (배열)
public class ArrayListSolution {
    /*
    알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
    my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서
    'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
    1 ≤ my_string의 길이 ≤ 1,000l
     */
    public int[] solution(String my_string){
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++){
            int temp = (int) my_string.charAt(i);
            char ch = my_string.charAt(i);
            if((65 <= temp) && (temp <= 90)){ // 대문자
                answer[ch-'A'] = countChar(my_string,ch);
            }else if((97 <= temp) && (temp <= 122)){
                answer[ch-'a'+26] = countChar(my_string,ch);
            }else {
                break;
            }
        }
        return answer;
    }
    public int countChar(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
