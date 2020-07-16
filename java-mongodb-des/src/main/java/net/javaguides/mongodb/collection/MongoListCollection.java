package net.javaguides.mongodb.collection;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoListCollection {
	
	public static void main(String[] args) {
		
		Logger mongoLogger = Logger.getLogger("org.mongodb.drive");
		mongoLogger.setLevel(Level.SEVERE);
		
		try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
			
			MongoDatabase database = mongoClient.getDatabase("javaguides");
			
			for (String name: database.listCollectionNames()) {
				System.out.println(name);
			}
		}
	}

}
