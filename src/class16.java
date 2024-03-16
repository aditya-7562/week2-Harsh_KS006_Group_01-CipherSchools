class Demo{
    private int a = 5;
    private int b = 10;
    private int c = 15;
    private int d = 20;

    public int getA(){
        System.out.println("Value of A read");
        return this.a;
    }

    public int getB(){
        System.out.println("Value of B read");
        return this.b;
    }

    public void setA(int a){
        if(a>100){
            this.a = a;
            System.out.println("Value of A changed to: " + a);
        }else{
            System.out.println("Cannot set, value outside limit");
        }
    }

    public void setB(int b){
        this.b = b;
    }

    public int getC(){
        return c;
    }

    public int getD(){
        return d;
    }

    public void setD(int d){
        this.d = d;
    }
}

public class class16 {
    public static void main(String[] args) {
        Demo d = new Demo();
        // System.out.println(d.a);
        System.out.println(d.getA());
        d.setA(85);
        System.out.println(d.getA());
        System.out.println(d.getD());
    }
}
