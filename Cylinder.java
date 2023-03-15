class Cylinder{
  public final double PI= 3.14;
  private double radius;
  private double height;
  
  public Cylinder(){
    this.radius = 5;
    this.height = 5;
  }
  public Cylinder(double r){
    this.radius = r;
    this.height = 5;
  }
  public Cylinder(double r, double h){
    this.radius = r;
    this.height = h;
  }
  public double getCircleArea(){
    return PI*radius*radius;
  }
  public double getCylinderVolume(){
    return PI*radius*radius*height;
  }
  public double getSurfaceAreaAllSides(){
    return (2*PI*radius*height)+(PI*radius*radius*2);
  }
  public double getRadius(){
    return radius;
  }
  public double getHeight(){
    return height;
  }
  public void printCylinder(){
    System.out.println("All pareters of this Cylinder");
    System.out.println("Radius = "+radius+" cm, Height = "+height+" cm");
    System.out.println("Circle Area = "+getCircleArea()+"  cm2");
    System.out.println("Surface Area of All Sides = "+getSurfaceAreaAllSides()+" cm2");
    System.out.println("Volume of Cylinder = "+getCylinderVolume()+" cm3");
  }
}