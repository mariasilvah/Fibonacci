//import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
	private List<Integer>Paresnu;
	private List<Integer>Imparesnu;
	
	public void saveFilep(String filepa, List<Integer> datap) {
		try(FileWriter writerpares= new FileWriter (filepa)){
			writerpares.write("Lista de pares:\n\n");
			for(Integer p:datap) {
				writerpares.write(p.toString()+"\n");
			}
				
		}
		catch (IOException ex) {
			System.err.println("Error al guardar el archivo: " + ex.getMessage());
		}
	}
	
	public void saveFilei(String fileimpa, List<Integer> datai) {
		try(FileWriter writerimpares= new FileWriter (fileimpa)){
			writerimpares.write("Lista de impares:\n\n");
			for(Integer i:datai) {
				writerimpares.write(i.toString()+"\n");
			}
				
		}
		catch (IOException ex) {
			System.err.println("Error al guardar el archivo: " + ex.getMessage());
		}
	}
	
	public void Execute() {
		Fibonacci liNu = new Fibonacci();///////////////////////// Fibonacci liNu = new Fibonacci();
		List<Integer>Seriefibo = liNu.Serief();
		//List<Integer>Seriefibo = listaNumeros.Serief();
		
		Splitter sp = new Splitter();
		Paresnu = sp.getPares(Seriefibo);
		Imparesnu = sp.getImPares(Seriefibo);
		
		saveFilep("Numeros pares.txt",Paresnu);
		saveFilei("Numeros impares.txt",Imparesnu);

	}
}

