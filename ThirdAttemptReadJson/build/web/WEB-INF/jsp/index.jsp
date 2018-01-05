<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script language = "JavaScript" type = "text/javascript"></script>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>UACS Table</title>
    </head>

    
    <body> 
         
        <script> 
            importPackage(ReadJsonUrl);
            function createTable(){ 
                
                var body = document.getElementsByTagName("body")[0];
                
                var tbl = document.createElement("table");
                var tblBody = document.createElement("tbody");
                
                for(var i = 1; i <= myresponse.length; i++){ 
                    
                    for (var j = 1; myresponse.length; j++) {
                        
                        var cell = document.createElement("td");    
                  var cellText = document.createTextNode("cell is row "+i+", column "+j); 

                    
                    <%
                    
                         JSONObject jsonObject = myresponse.getJSONObject(j);
                            
                         String uacs = jsonObject.getString("uacs"); 
                         String department = jsonObject.getString("department");
                         String agency = jsonObject.getString("agency"); 
                        
                    %>
                    
                    cell.appendChild(cellText);
                    row.appendChild(cell);
            }

            
                    tblBody.appendChild(row);
            }
                    
                    tbl.appendChild(tblBody);
        
                    body.appendChild(tbl);
        
                    tbl.setAttribute("border", "2");
                }
                }
            }
        
        </script>
        
    </body>   
    
</html>
