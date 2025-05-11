import java.util.*;
public class RomanToInt {
    public static int romantoint (String s){
        HashMap<Character,Integer>romannum=new HashMap<>();
        romannum.put('I',1);
        romannum.put('V',5);
        romannum.put('X',10);
        romannum.put('L',50);
        romannum.put('C',100);
        romannum.put('D',500);
        romannum.put('M',1000);
        int total=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
           int cur= romannum.get(s.charAt(i));
            
            if(cur<prev){
                total-=cur;
            }
            else{
                total+=cur;
            }
            prev=cur;
            
        }
        return total;
        
    }
    public static void main(String args[]){
        String roman="IL";
        int num=romantoint(roman);
        System.out.print(num);
    }
    
}
