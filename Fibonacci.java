import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
	public List<Integer> Serief(){
		List<Integer> listaNumeros = new ArrayList<Integer>();
	
	//public static void main(String[] args) {
		int temp=0;
		int y=0;
		int suma=1;
		//{
			for(int sumaf=1; sumaf<=30; sumaf++) {
				temp = y;  
				y=suma;
				suma=suma+temp;
				listaNumeros.add(suma);
			}
		return listaNumeros;
			//System.out.print(listaNumeros+"\n");
		//}
			
			//System.out.println(listaEnteros);	
	//}
	//public static void Split(Splitter Paresnu){
		//System.out.print("Pares:\n");
		//System.out.print(Paresnu);
	//}
	}
}
