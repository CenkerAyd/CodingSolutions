package WarmUp_2;
//https://codingbat.com/prob/p194667
public class CountXX {
    public int countXX(String str){
        int count=0;
        for (int i=0;i<str.length()-1;i++){
            if (str.substring(i,i+2).contains("xx")) count++;
        }
        return count;
    }
}
