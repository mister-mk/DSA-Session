// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("Main()");
        stack.push("print()");
        stack.push("printHello()");
        
        //for(String str : stack){System.out.println(str);}//
        
        while(! stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        
        for
    }
}
