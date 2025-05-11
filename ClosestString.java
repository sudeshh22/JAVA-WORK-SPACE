public class ClosestString{
    public static void main(String[]args){
        String words[]={"sam","is","good","boy","and","Sweet","boy"};
        int position1=-1;
        int position2=-1;
        for(int i=0;i<words.length;i++){
        if(words[i].equals("is")){
            position1=i;
        }
    }
    for(int i=0;i<words.length;i++){
        if(words[i].equals("boy")){
            position2=i;
        }
    }

        int num=Math.abs(position1-position2);
        System.out.print(num);
    }
}
