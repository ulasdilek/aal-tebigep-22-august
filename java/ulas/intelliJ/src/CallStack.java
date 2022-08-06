public class CallStack {

    public static void main (String[] args)
    {
        callYourself();
    }

    // Since method calls are stored in the stack section of the memory, this method calling itself
    // endlessly will fill the stack capacity and cause the program to stop with a StackOverflowError
    static void callYourself(){
        callYourself();
    }
    // A method calling itself is called RECURSION. We are going to learn more about it later

}
