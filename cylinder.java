import java.util.Scanner;

class Cylinder1
{
    private int radius;
    private int height;

    public Cylinder1()
    {
        radius = 1;
        height = 1;
    }

    public Cylinder1(int r, int h)
    {
        setRadius(r);
        setHeight(h);
    }

    public void setRadius(int r)
    {
        if(r>0)
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
}


public class cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();

        Cylinder1 c = new Cylinder1(r, h);

        System.out.println("The vloume of cyliner is: "+c.volume());
        System.out.println("The radius value is: "+c.getRadius());

        sc.close();
    }
}
