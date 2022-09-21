import java.util.HashMap;
import java.util.Map;

public class FinalValueAfterOperation {
    public int finalValueAfterOperationsUsingDict(String[] operations){
        int x = 0;
        Map<String, Integer> dict = new HashMap<>();
        dict.put("--x", -1);
        dict.put("x--", -1);
        dict.put("x++", 1);
        dict.put("++x", 1);
        for (String s: operations){
            x += dict.get(s);
        }
        return x;
    }
    public int finalValueAfterOperationsUsingStringOperation(String[] operations){
        int X = 0;
        for (String s: operations){
            if (s.charAt(1)=='+') X++;
            else X--;
        }
        return X;
    }

    public static void main(String[] args){
       FinalValueAfterOperation sol = new FinalValueAfterOperation();
       String[] op = {"--X","X++","X++"};
       System.out.println(sol.finalValueAfterOperationsUsingDict(op));
       String[] op1 = {"X++","++X","--X","X--"};
        System.out.println(sol.finalValueAfterOperationsUsingStringOperation(op1));
    }
}
