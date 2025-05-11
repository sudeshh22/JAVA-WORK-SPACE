public class Anagram{
    public static void main(String[]args){
        String a="silent";
        String b="listEn";
        int sum=0;
        int sum2=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            sum=ch+sum;
        }
        for(int i=0;i<b.length();i++){
            char ch2=b.charAt(i);
            sum2=ch2+sum2;
        }
        if(sum==sum2){
            System.out.print("it is anagram");
        }
        else{
            System.out.print("it is not anagram");
        }
    }
}
        

   
