import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Splitter {
	public static List<Integer>getPares(List<Integer>listaNumeros){
		List<Integer>Paresnu = new ArrayList<>();
		for(Integer p:listaNumeros) {
			if(p%2==0) {
				Paresnu.add(p);
			}
		}
		return Paresnu;
	}

	
	public static List<Integer>getImPares(List<Integer>listaNumeros){
		List<Integer>Imparesnu = new ArrayList<>();
		for(Integer i:listaNumeros) {
			if(i%2!=0) {
				Imparesnu.add(i);
			}
		}
		return Imparesnu;
	}
}