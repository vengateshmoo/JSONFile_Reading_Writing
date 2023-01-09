package jsonfilewriting_reading;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFile_Writing {
	public static void main(String[] args) throws IOException {
		
	JSONObject jsonobject = new JSONObject();
	jsonobject.put("First_Name", "Vengatesh");
	jsonobject.put("Last_Name", "moo");
	jsonobject.put("Age",1);
	
	JSONArray jsonarray= new JSONArray();
	jsonarray.add("magical smiles");
	jsonarray.add("Active Learner");
	jsonarray.add("Wide Thinker");
	
	jsonobject.put("Special Qualities", jsonarray);
	
	FileWriter filewriter = new FileWriter("vengatesh.json");
	filewriter.write(jsonobject.toJSONString());
	filewriter.close();
	}	
}
