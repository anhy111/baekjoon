class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String sp : spell) {
            for (int i=0; i<dic.length; i++) {
                if (dic[i].contains(sp)) {
                    dic[i] = dic[i].replaceAll(sp, "");
                } else {
                    dic[i] = "A";
                }
            }
        }

        for (String dictionary : dic) {
            if (dictionary.equals("")){
                return 1;
            }
        }
        return 2;
    }
}