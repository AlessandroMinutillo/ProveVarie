package Database;

import java.util.Vector;
import Model.Metadata;

public class DatabaseClass {
	
	private static Vector<Metadata> metadata = new Vector<Metadata>();
	
	/*
	 * Inizializza e restituisce l array list di Metadata
	 * @return ArrayList di oggetti Metadata
	 */
	
	public static Vector<Metadata> getVectorMetadata() {
		metadata.add(new Metadata("CityName","Nome della citta'","String"));
		metadata.add(new Metadata("Lat","Latitudine della citta'","Double"));
		metadata.add(new Metadata("Lon","Longitudine della citta'","Double"));
		metadata.add(new Metadata("TempAtt","Temperatura attuale (°C)","Double"));
		metadata.add(new Metadata("PressAtt","Pressione attuale (hPa)","Double"));
		metadata.add(new Metadata("TempMin","Temperatura minima (°C)","Double"));
		metadata.add(new Metadata("TempMax","Temperatura massina (°C)","Double"));
		metadata.add(new Metadata("PressMin","Pressione minima (hPa)","Double"));
		metadata.add(new Metadata("PressMax","Pressione massima (hPa)","Double"));
		metadata.add(new Metadata("TempMedia","Media della temperatura (°C)","Double"));
		metadata.add(new Metadata("TempVar","Varianza della temperatura (°C)","Double"));
		metadata.add(new Metadata("PressMedia","Media della pressione (hPa)","Double"));
		metadata.add(new Metadata("PressVar","Varianza della pressione (hPa)","Double"));
		return metadata;
	}	
}
	
