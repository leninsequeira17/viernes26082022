package tareas;

public class octaedro {

	public static void main(String[] args) {
		double a,A,V;
		
		a=1.22;
		A=2*Math.pow(a, 2)*Math.sqrt(3);
		V=Math.sqrt(2)/3*Math.pow(a, 3);
		
		System.out.println("datos del octaedro:");
        System.out.println("area menor:"+a);
        System.out.println("Area mayor"+A);
        System.out.println("volumen:"+V);
        
	}

}
