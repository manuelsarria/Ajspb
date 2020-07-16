package net.javaguides.mongodb.database;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 * Java MongoDB Connection	
 *
 */
public class ConnectToDB {
    public static void main(String args[]) {

        try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {

            MongoDatabase database = mongoClient.getDatabase("javaguides");

            System.out.println("database name -> " + database.getName());

            for (String name: database.listCollectionNames()) {

                System.out.println(name);
            }
        }
    }
}
