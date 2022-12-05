public class R139Two {

    public String alphabetical(String str){
        String word="";
        char letter='a';
        char letter2='a';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>letter){
                letter=str.charAt(i);
                word=word+str.charAt(i);
            }else if(letter2==str.charAt(i)){
                letter=str.charAt(i);
            }
        }
        return word;
    }}
