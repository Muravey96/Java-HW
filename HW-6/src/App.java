import java.util.HashSet;

import LaptopLib.Laptops;

public class App {

    public static void main(String[] args) {
        Laptops lt1 = new Laptops("asus", 15.6,  "windows", 16, 128);
        Laptops lt2 = new Laptops("hp", 15.6,  "linux", 8, 128);
        Laptops lt3 = new Laptops("macbook", 13.3, "ios", 8, 254);


        HashSet<Laptops> ltSet = new HashSet<Laptops>();
       ltSet.add(lt1);
       ltSet.add(lt2);
       ltSet.add(lt3);

       System.out.println(lt1);
       System.out.println(lt2);

       System.out.println(lt1.equals(lt3)); 
       System.out.println(ltSet.contains(lt2));
    }
}