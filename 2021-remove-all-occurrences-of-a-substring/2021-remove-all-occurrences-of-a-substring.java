class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        int m = part.length();
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i < n; i++ ){
            sb.append(s.charAt(i));
            if(sb.length() >= m){
                String subString = sb.substring(sb.length() - m);
                if(subString.equals(part)){
                    sb.setLength(sb.length() - m );
                }
            }
        }
        return sb.toString();
    }
}