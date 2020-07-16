package net.javaguides.mongodb.collection;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDropCollection {
	
	public static void main(String[] args) {
		
		try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
			
			//crear el cliente de mongo
			MongoDatabase database  = mongoClient.getDatabase("javaguides");
			//acceder a la base de datos
			database.createCollection("sampleCollection");
			//crear la coleccion
			System.out.println("Collections created successfully");
			//obtener la coleccion
			MongoCollection<Document> collection = database.getCollection("sampleCollection");
			System.out.println("collection name ->" + collection);
			
			collection.drop();
			System.out.println("collection dropped successfully");			
			
		}
	}

}
