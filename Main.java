import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import java.util.Scanner;
import Laura;


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
		    Laura_patten.try_codes(
			    {
			    2261, 8427,
                            0446, 8139,
                            9460, 1561,
                            3881, 1061,
                            5594, 2484,
                            7973, 8307,
                            6269, 6753,
                            7713, 5704,
                            5056, 3673,
                            0149, 2872,
			    "6797 0711
                             2886 8428
                             5928 7748
                             3754 8612
                             4297 7448
                             6269 3136
                             5330 4100
                             9587 6182
                             9987 9134
                             8524 4652"
			    }
		    );
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
