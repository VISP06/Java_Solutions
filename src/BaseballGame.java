import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = new String[]{"1", "2", "3", "C", "C"};
        System.out.println(calPoints(ops));
    }
    static public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(String op:operations){
            switch(op){
                case "+":int lastScore=stack.pop();
                         int newScore=lastScore+stack.peek();
                         stack.push(lastScore);
                         stack.push(newScore);
                         break;
                case "D":stack.push(2*stack.peek());
                         break;
                case "C":stack.pop();
                         break;
                default:stack.push(Integer.parseInt(op));
                        break;
            }
        }
        for(int score:stack){
            sum+=score;
        }
        return sum;
    }
}
