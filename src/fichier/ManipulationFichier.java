package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\Users\\totow\\Documents\\workspace_spring\\ensemble\\donnees_communes.csv");
		
		Path pathDestination = Paths.get("C:\\Users\\totow\\Documents\\workspace_spring\\ensemble\\donnees_communes_25000_habitants_minimum.csv");
		
		List<String> fichier = new ArrayList<>();
		
		List<String> lines = Files.readAllLines(path);
		for (int i = 1; i < lines.size(); i++) {
			String[] data = lines.get(i).split(";");
			if(Integer.parseInt(data[9]) > 25000){
				String ville = new String(data[6] + ";" + data[0] + ";" + data[9]);
				fichier.add(ville);
			}
		}
		Files.write(pathDestination, fichier);

	}

}
