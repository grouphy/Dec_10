package cn.dkc_1210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket s = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedWriter bw = null;
		try {
			s = new Socket(InetAddress.getLocalHost(), 9999);
			br1 = new BufferedReader(new InputStreamReader(System.in));
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				String str = br1.readLine();
				bw.write(str+"\n");
				bw.flush();
				if(str.equals("end")){
					break;
				}
				System.out.println("服务端说: "+br2.readLine());
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
		}
	}
}
