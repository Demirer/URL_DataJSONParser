package Test.JSON_Parser;
import org.json.JSONException;
import org.json.JSONObject;


import com.jayway.restassured.RestAssured;

public class Parser {
   
	public static void main(String args[]) throws JSONException {
        
		String Data= RestAssured.given().port(8080).get("/TestWeb/start").asString();
        System.out.println(Data);

        JSONObject jsonObj = new JSONObject(Data);
        
        String name = jsonObj.getString("Name");
        System.out.println("Name Of JSON Object City:" + name);
        
        String weather = jsonObj.getString("Weather");
        System.out.println("Weather Of JSON Object City:" +  weather);
        
        String ID = jsonObj.getString("ID");
        System.out.println("ID Of JSON Object City:" + ID);
        
        String country = jsonObj.getString("Country");
        System.out.println("Country Of JSON Object City:" + country);
        
         
        
		
	
	
	
	
	}
}