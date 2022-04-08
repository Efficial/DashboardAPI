import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        Integer n = 3;

        ArrayList<String> result = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        String string = "+--";
        char[] letter=string.toCharArray();
        for(int x = 0; x < n; x++){
            builder.append(letter[x]);

        }
            System.out.println(builder);
        }

    public String solution(int N) {

        String result = "";

        for(int i = 1; i<= N; i++){
            if(i%2!=0){
                result += ("POWER" + "\n");

            }else{
                String next = String.valueOf(i);
                result += next + "\n";
            }
        }
        System.out.println(result);
        return result;
    }
}



