package capgemini6;
import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		double vol, H, R, L,B;
	}
	    // volume of cube with one arguments   //
	    void findVolume(double R) {
	        System.out.println("Volume of cube = " + (R * R * R));
	    }
	    // volume of cube with three arguments //
	    void findVolume(double L, double B, double H) {
	        System.out.println("Volume of rectangular box = " + (L * B * H));
	    }
	    // volume of cube with two arguments //
	    void findVolume(double H, double R) {
	        System.out.println("Volume of cylinder = " + (3.14 * H * H * R));
	    }
	}
	class VolumeMain {
	    public static void main(String args[]) {
	        double H, R, L;
	        // Scanner class object to read input values
	        Scanner s = new Scanner(System.in);
	        // object of Volume class to call methods 
	        Volume obj = new Volume();
	        // read sides / length,breadth / radius, height from user
	        // call findVolume() with parameters
	        System.out.print("Enter the side of cube : ");
	        H = s.nextDouble();
	        obj.findVolume(H);
	        System.out.print("Enter the length, width and height of the rectangular box : ");
	        H = s.nextDouble();
	        R = s.nextDouble();
	        L = s.nextDouble();
	        obj.findVolume(H, R, L);
	        System.out.print("Enter the radius and height of the cylinder : ");
	        H = s.nextDouble();
	        R = s.nextDouble();
	        obj.findVolume(H, R);
	    }
	
	
}




