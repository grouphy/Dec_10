package cn.dkc_1210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		Socket s = null;
		ServerSocket ss = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedWriter bw = null;
		try {
			ss = new ServerSocket(9999);
			s = ss.accept();
			br1 = new BufferedReader(new InputStreamReader(System.in));
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				String str = br2.readLine();
				System.out.println("客户端说: "+str);
				if(str.equals("end")) {
					break;
				}
				String str1 = br1.readLine();
				bw.write(str1+"\n");
				bw.flush();
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(s!=null) {
				try {
					s.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(br1!=null) {
				try {
					s.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(br2!=null) {
				try {
					s.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(bw!=null) {
				try {
					s.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(ss!=null) {
				try {
					ss.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
