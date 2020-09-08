import java.util.Scanner;
import java.util.Stack;

public class Parentesis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine(); // .nextInt() dejó un "\n"

    for(int i = 0; i < n; i++){
      String str = sc.nextLine();

      System.out.println((isBalanced(str)) ? "YES" : "NO");
    }
  }

  public static boolean isBalanced(String str){
    String apertura = "([{";
    Stack<Character> s = new Stack<>();

    for(char c : str.toCharArray()){
      if(apertura.indexOf(c) != -1){
        s.add(c);
        continue;
      }

      if(s.isEmpty()) return false;

      char tmp = s.pop();
      switch(c){
      case ')':
        if(tmp != '(') return false;
        break;
      case ']':
        if(tmp != '[') return false;
        break;
      case '}':
        if(tmp != '{') return false;
        break;
      }
    }

    return s.isEmpty();
  }
}
