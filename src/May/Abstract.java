package May;

abstract class Shape{
    abstract void draw();
    abstract void erase();
}
class Rect extends Shape{
    void draw() {       // draw() implemented in subclass misc.Rect
        System.out.println("Drawing a rectangle");
    }
    void erase(){
        System.out.println("Erasing a rectangle");
    }
    public static void main(String[] args){
        Shape r1 = new Rect();
        r1.draw();
        r1.erase();
    }
}
