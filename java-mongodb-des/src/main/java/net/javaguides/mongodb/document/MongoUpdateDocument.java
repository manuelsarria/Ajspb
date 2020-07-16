package net.javaguides.mongodb.document;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoUpdateDocument {
    public static void main(String[] args) {

        // Creating a Mongo client
        try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {

            // Accessing the database
            MongoDatabase database = mongoClient.getDatabase("javaguides");

            // Retieving a collection
            MongoCollection < Document > collection = database.getCollection("users");

            collection.updateOne(new Document("_firstName", "Ramesh"),
                new Document("$set", new Document("_lastName", "Pawar")));

            // Retrieving the documents after updation
            try (MongoCursor < Document > cur = collection.find().iterator()) {

                while (cur.hasNext()) {

                    var doc = cur.next();
                    var users = new ArrayList < > (doc.values());

                    System.out.printf("%s: %s%n", users.get(1), users.get(2));
                }
            }
        }
    }
}