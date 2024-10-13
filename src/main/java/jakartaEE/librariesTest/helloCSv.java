package jakartaEE.librariesTest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVFormat.Builder;
import org.apache.commons.csv.CSVPrinter;

import lombok.Cleanup;
public class helloCSv {
	static class pessoa{
		public String nome;
	}
	
public static void main(String[] args) throws IOException {
	 File p = new File("."+"/arquivo.csv");
	if(!p.exists()) {
		p.createNewFile();
	}
	@Cleanup Writer escritor = new FileWriter(p);
	@Cleanup CSVPrinter csv = new CSVPrinter(escritor, CSVFormat.DEFAULT.builder().setHeader("nome", "idade").build());
	csv.printRecord("erick", "18");
	
	csv.print(csv);
	
}


}
