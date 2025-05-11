import java.util.*;
public class IsomorphicString {
    public static void main(String[]args){
        String a1="aab";
        String b1="xxy";
        boolean Isotrophic=true;
        if(a1.length()==b1.length()){
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();

        for(int i=0;i<a1.length();i++){
            char c1=a1.charAt(i);
            char c2=b1.charAt(i);
            if(map1.containsKey(c1)){
                if(map1.get(c1)!=c2){
                    Isotrophic=false;


                }
            }
            else{
                map1.put(c1,c2);
            }
            if(map2.containsKey(c2)){
                if(map1.get(c2)!=c1)
                 Isotrophic=false;
            }
            else{
                map2.put(c1,c2);

            }
        }
        System.out.print(Isotrophic);
    }
}
}
        
