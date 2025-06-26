class Solution {
    public String solution(String letter) {
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morse;
        morse = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String s : morse){
            for(int i = 0; i < morseList.length; i++){
                if(s.equals(morseList[i])){
                    sb.append(Character.toString(i + 'a'));
                }
            }
        }
        return sb.toString();
    }
}