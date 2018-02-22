package com.main.db;
import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;;
public class MongoJava {

	public static void main(String[] args) throws UnknownHostException, MongoException {
		Mongo mongoClient = new Mongo("localhost",27017);
		DB db = mongoClient.getDB("java");
		boolean auth = db.authenticate("root", "root".toCharArray());
		
		DBCollection table = db.getCollection("user");
//select
		BasicDBObject Query = new BasicDBObject();
		
		DBCursor cursor = table.find();

		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
//insert
		Query = new BasicDBObject();
		Query.put("name", "malar");
		Query.put("Emp ID", 17427);
		Query.put("createdDate", new Date());
		table.insert(Query);
		
		
//update
		
		Query = new BasicDBObject();
		Query.put("name", "malar");

		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name", "Malarvizhi");

		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);

		table.update(Query, updateObj);
//Delete
		Query = new BasicDBObject();
		Query.put("name", "Malarvizhi");

		table.remove(Query);
	}

}
