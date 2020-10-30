public class Tester {
  public static void main(String[] args) {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(6, 0);
    Point p3 = new Point(3, 4);
    Point p4 = new Point(3, 4);

    System.out.println(p1.getX());
    System.out.println(p2.getX());
    System.out.println(p3.getX());

    System.out.println(p1.distanceTo(p2));
    System.out.println(p2.distanceTo(p3));
    System.out.println(p3.distanceTo(p1));

    System.out.println(p1.equals(p4));
    System.out.println(p3.equals(p4));


    Triangle t1 = new Triangle(p1, p2, p3);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t1.classify());

    System.out.println(t1);
  }
}
