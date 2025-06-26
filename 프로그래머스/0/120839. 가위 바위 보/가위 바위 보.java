class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == '0'){
                sb.append(5);
            }else if(rsp.charAt(i) == '2'){
                sb.append(0);
            }else{
                sb.append(2);
            }
        }
        return sb.toString();
//         Map<Character,Character> winRsp = new HashMap<>();
//         winRsp.put('2','0');
//         winRsp.put('0','5');
//         winRsp.put('5','2');
        
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < rsp.length(); i++){
//             char c = rsp.charAt(i);
//             sb.append(winRsp.get(c));
//         }
//         return sb.toString();
    }
}
