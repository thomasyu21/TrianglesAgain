public class Triangle {
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
  }

  public double getArea() {
    double side1 = v1.distanceTo(v2);
    double side2 = v1.distanceTo(v3);
    double side3 = v2.distanceTo(v3);
    double semiP = this.getPerimeter()/2;
    return Math.sqrt((semiP)*(semiP-side1)*(semiP-side2)*(semiP-side3));
  }

  public String classify() {
    double side1 = (Math.round(v1.distanceTo(v2) * 10000)) / 10000.;
    double side2 = (Math.round(v1.distanceTo(v3) * 10000)) / 10000.;
    double side3 = (Math.round(v2.distanceTo(v3) * 10000)) / 10000.;
    if (side1 == side2 && side2 == side3) {
      return "equilateral";
    }else if (side1 == side2 || side1 == side3 || side2 == side3) {
      return "isosceles";
    }else{
      return "scalene";
    }
  }

  public String toString() {
    return "v1("+v1.getX()+", "+v1.getY()
          +") v2("+v2.getX()+", "+v2.getY()
          +") v3("+v3.getX()+", "+v3.getY()+")";
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }else if (index == 1) {
      v2 = newP;
    }else if (index == 2) {
      v3 = newP;
    }
  }

}
