package JavaAdvanced.oop;

class ConstRectangle {
    public final int a;
    public final int b;
//    protected final int area;

    ConstRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a * b;
    }

}

class ConstSquare extends ConstRectangle {
    ConstSquare(int a) {
        super(a, a);
    }
}

class ConstSquareAndRectangle {
    public static void main(String[] args) {
        ConstRectangle cr = new ConstSquare(3);
        System.out.println(cr.getArea());

    }
}
