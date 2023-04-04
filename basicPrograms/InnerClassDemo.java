package basicPrograms;

class OuterClass {
    private int x;
    
    public OuterClass(int x) {
        this.x = x;
    }
    
    private class InnerClass {
        public void printX() {
            System.out.println("The value of x is " + x);
        }
    }
    
    public void printX() {
        InnerClass inner = new InnerClass();
        inner.printX();
    }
}

public class InnerClassDemo2222 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        outer.printX(); // prints "The value of x is 10"
    }
}