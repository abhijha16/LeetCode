import java.util.Arrays;
import java.util.Scanner;

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }
}

public class footwearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Footwear[] footwear = new Footwear[n];
        for(int i=0; i<n; i++) {
            int footwearId = sc.nextInt();
            sc.nextLine();
            String footwearName = sc.nextLine();
            String footwearType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            footwear[i] = new Footwear(footwearId, footwearName, footwearType, price);
        }

        String type = sc.nextLine();
        String name = sc.nextLine();


        int footwearCount = getCountByType(footwear, type);

        if(footwearCount != 0) {
            System.out.println(footwearCount);
        }
        else {
            System.out.println("Footwear Not Available");
        }

        Footwear[] footname = getSecondHighestPriceByBrand(footwear, name);

        if(footname != null) {
            System.out.println(footname[1].getPrice());
        }
        else {
            System.out.println("No Footwear Brand");
        }
    }

    public static int getCountByType(Footwear[] footwear, String type) {
        int count = 0;
        for(int i=0; i<footwear.length; i++) {
            if(footwear[i].getFootwearType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public static Footwear[] getSecondHighestPriceByBrand(Footwear[] footwear, String type) {
        Footwear[] obj = new Footwear[0];

        for(int i=0; i<footwear.length; i++) {
            if(footwear[i].getFootwearName().equalsIgnoreCase(type)) {
                obj = Arrays.copyOf(obj, obj.length+1);
                obj[obj.length-1] = footwear[i];
            }
        }

        Footwear temp;

        for(int i=0; i<obj.length; i++) {
            for(int j=i+1; j<obj.length; j++) {
                if(obj[i].getPrice() < obj[j].getPrice()) {
                    temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }

        if(obj.length > 0) {
            return obj;
        }
        else {
            return null;
        }
    }
}
