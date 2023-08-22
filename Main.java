import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import java.util.Scanner;

import java.io.*;


public class Main {
	public static void main(String[] args) {
	     
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter Url: ");
		String input = sc.nextLine();
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(input)).build();
		
		
	
		
		try{
		    
		    HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		    
		    String body = response.body();
		    
		    System.out.println(body);
		    saveFile(body);
		    System.out.println("Sucess ");
		    
		}catch(IOException | InterruptedException e){
		      System.out.println("Url Invalida Ou Sem Conexão");
		
		    e.printStackTrace();
		    System.out.println("Url Invalida Ou Sem Conexão");
		    
		}
	}
	
	public static void saveFile(String content){
	 
	 try{
	  FileWriter file = new FileWriter("index.html");
	  file.write(content);
	  file.close();
	  
	 }catch(IOException e){
	   e.printStackTrace();
	 }
	}
}