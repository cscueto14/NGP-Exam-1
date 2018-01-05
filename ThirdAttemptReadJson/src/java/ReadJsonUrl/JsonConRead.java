/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadJsonUrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

// I imported java-json.jar on the library

/**
 *
 * @author ISHI
 */
public class JsonConRead {
    
    public static void main (String [] args) throws IOException{
        
        try {
            
            // This creates the connection between java and the url
            
            URL url = new URL("http://igovphil.github.io/java-exam-01/uacs-agency.json"); 
            URLConnection con = url.openConnection();                                     
            HttpURLConnection hc = (HttpURLConnection) url.openConnection();             
            
            /* This reads data from the url, I called getInputStream to open the connection 
            between java and url to read the data
            */
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String inpLine; 
            StringBuilder response = new StringBuilder();
            while((inpLine = br.readLine()) != null){ 
                
                
               response.append(inpLine);

            }
            br.close();
            System.out.println(response.toString());
            
            JSONArray myresponse = new JSONArray(response.toString()); /* This code coverts response to a json array since the json
                                                                          data in the url is array. */
            
            for(int i = 0; i < myresponse.length(); i++){  // This will print the json data until it reach the total number of the output.
                
                JSONObject jsonObject = myresponse.getJSONObject(i);
                String uacs = jsonObject.getString("uacs"); 
                String department = jsonObject.getString("department");
                String agency = jsonObject.getString("agency"); 
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
            
            
            
        
        
    }
    
}
