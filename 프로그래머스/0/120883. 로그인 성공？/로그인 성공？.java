class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] members : db) {
            String dbId = members[0];
            String dbPw = members[1];
            if (dbId.equals(id) && dbPw.equals(pw)){
                return "login";
            } else if (dbId.equals(id)) {
                return "wrong pw";
            }
        }
        return "fail";
    }
}