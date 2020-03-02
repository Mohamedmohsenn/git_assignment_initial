package git_assignment_20170362;

public class SphereArea implements ISubscriber{
   
    static double area;
    
 public static void calcSphereArea(int raduis)        
    {
        area =  4* Math.PI * Math.pow(raduis, 2);
        area = Double.parseDouble(String.format("%.2f", area));
        System.out.println("The Area of the Sphere = " + area);
        
    }

    @Override
    public void notifySubscriber(String input) {
        int raduis = Integer.parseInt(input);
        calcSphereArea(raduis);
        
    }

}
