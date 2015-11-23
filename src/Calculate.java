import java.text.DecimalFormat;


public class Calculate {
	
	public enum SolveFor {
		Vf_1, Vf_2, Vi1, Vi2, m1, m2;
	}
	
	private static DecimalFormat df = new DecimalFormat("#.##");
	
	public static String[] solveFinalv1(double v1, double v2, double m1, double m2, Directions.Compass d1, Directions.Compass d2) {
		double finalAns;
		
		if(d1 != d2) v2 = v2*-1;
		
		double a,b;
		a = ((m1 - m2)/(m1 + m2))*v1;
		b = ((2*m2)/(m1 + m2))*v2;
		finalAns = a + b;
		
		String ans[] = new String[2];
		ans[0] = df.format(finalAns);
		ans[1] = "((" + m1 + " - " + m2 + ") / (" + m1 + " + " + m2 + ")) *" + v1 + " = " + a + "\n ((2*" + m2 + ") / (" + m1 + " + " + m2 + ")) *" + v2 + " = " + b + "\n Add Them:\n" + a + " + " + b + " = " + ans[0] + "m/s";
		
		return ans;
	}

	public static String[] solveFinalv2(double v1, double v2, double m1, double m2, Directions.Compass d1, Directions.Compass d2) {
		double finalAns;
		
		if(d1 != d2) v2 = v2*-1;
		
		double a,b;
		a = ((m2 - m1)/(m1 + m2))*v2;
		b = ((2*m1)/(m1 + m2))*v1;
		finalAns = a + b;
		
		String ans[] = new String[2];
		ans[0] = df.format(finalAns);
		ans[1] = "((" + m2 + " - " + m2 + ") / (" + m1 + " + " + m2 + ")) *" + v2 + " = " + a + "\n ((2*" + m1 + ") / (" + m1 + " + " + m2 + ")) *" + v1 + " = " + b + "\n Add Them:\n" + a + " + " + b + " = " + ans[0] + "m/s";
		
		return ans;
	}
	
	public static String solveInitialV1(double vf, double vi2, double m1, double m2) {
		double vi = 0;
		
		return df.format(vi);
	}
	
	public static String solveInitialV2(double vf, double vi1, double m1, double m2) {
		double vi = 0;
		
		return df.format(vi);
	}
	
	public static String solveMass1(double vf, double m2, double vi1, double vi2) {
		double m = 0;
		
		return df.format(m);
	}

	public static String solveMass2(double vf, double m1, double vi1, double vi2) {
		double m = 0;
		
		return df.format(m);
	}
	
}
