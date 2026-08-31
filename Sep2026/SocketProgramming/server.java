package Sep2026.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

import java.applet.*;

public class server {
    public static void main(String[] args) throws IOException{
        ServerSocket sk = new ServerSocket(50);

        System.out.println("Server is waiting ");
        
        Socket socket = sk.accept();

        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        String message = br.readLine();
        System.out.println("client "+ message);

        PrintWriter p = new PrintWriter(socket.getOutputStream(),true);
        p.println("Hello from server");


    }
}
