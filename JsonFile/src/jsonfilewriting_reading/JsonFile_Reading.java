package jsonfilewriting_reading;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFile_Reading {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser = new JSONParser();
		
		FileReader filereader=new FileReader("vengatesh.json");
		
		Object parsedObject=jsonparser.parse(filereader);
		
		JSONObject jsonobject= (JSONObject) parsedObject;
		
		String firstname=(String)jsonobject.get("First_Name");
		String lastname=(String) jsonobject.get("Last_Name");
		Long age=(Long) jsonobject.get("Age");
		JSONArray arrays= (JSONArray) jsonobject.get("Special Qualities");
		
		Iterator iterator= arrays.iterator();
		System.out.println("My Name is:"+firstname);
		System.out.println("Last_name is:"+lastname);
		System.out.println("My age is:"+age);;
		while (iterator.hasNext()) {
			System.out.println("Special Qualities are:"+iterator.next());
		}
	}

}
