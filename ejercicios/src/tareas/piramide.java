package tareas;

public class piramide {

	public static void main(String[] args) {
		double Pbase,n,l,h,AP,Alateral;
		double Atotal,volumen,ap,p,Abase;
		
		p=22.0;
		h=5.2;
		n=3;
		l=6.2;
		Pbase=(n*l);
		ap=3.40;
		AP=(h*h)+(ap*ap);
		double APen = Math.sqrt(AP); 
		Alateral=(Pbase*APen);
		Abase=(p*ap)/2;
		Atotal=Alateral+Abase;
		volumen=(Abase*h)/3;
		
		System.out.println("datos de la piramide:");
        System.out.println("numero de lados:"+n);
        System.out.println("longitud de los lados:"+l);
        System.out.println("altura:"+h);
        System.out.println("Area lateral:"+Alateral);
        System.out.println("Area total:"+Atotal);
        System.out.println("volumen:"+volumen);

	}

}
