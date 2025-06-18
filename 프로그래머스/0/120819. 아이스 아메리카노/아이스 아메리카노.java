class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int cup = money/5500;
        int saveMoney = money%5500;
        answer = new int[]{cup,saveMoney};
        return answer;
    }
}