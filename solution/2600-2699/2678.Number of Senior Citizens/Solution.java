class Solution {
    public int countSeniors(String[] details) {
        int old=0;

        int n =details.length;

        for (String s:details){
            int tensplace=(s.charAt(11)-'0')*10;
            int firstplace=s.charAt(12)-'0';
            int age=tensplace+firstplace;
            if(age>60){
                old++;
            }
            
        }
        return old;
    }
}
