package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 서버 소켓
		ServerSocket serverSocket= null;
		try {
			//바인드: 주소와 포트 연결
			serverSocket = new ServerSocket();
			//모든 ip의 10000 포트 허용
			InetSocketAddress ip= new InetSocketAddress("192.168.0.1",10000);
		    serverSocket.bind(ip);
		    
		    System.out.println("<서버 시작>");
		    System.out.println("[연결을 기다립니다.]");
		    
		    Socket socket = serverSocket.accept();// 연결 대기
		    // 접속 성공시 :클라이언트 정보 확인
		    InetSocketAddress remoteAddress= (InetSocketAddress)socket.getRemoteSocketAddress();
		    System.out.println("[클라이언트가 접속되었습니다.");
		 //   System.out.println(remote.getAddress()+":"+remote.getport());
		    
		    // 클라이언트 메세지 수신
		    // 스트림 열기
		    InputStream is= socket.getInputStream();
		    //주고 받을 데이터 Text>reader
		    Reader ist= new InputStreamReader(is,"UTF-8");
		    BufferedReader br= new BufferedReader(ist);
		   //클라이언트로 Echo back 을 하기 위한 스트림 열기
		    
		    OutputStream os= socket.getOutputStream();
		    Writer osw = new OutputStreamWriter(os,"UTF-8");
		    BufferedWriter bw= new BufferedWriter(osw);
		    
		    
		    //데이터 읽기
		    
		    String message;
		    
		    while(true) {
		    	message= br.readLine(); // 한라인만 읽기
		    	if(message==null) { //더 읽을 데이터 없음
		    		System.out.println("[접속 종료!]");
		    		break;
		    	}
		    	System.out.println("클라이언트로부터의 메세지:"+message);
		        System.out.println("Echo Back:"+message);
		        // 클라이언트로 Echo back
		        bw.write("[Echo]:"+message);
		        bw.newLine(); //전송
		        bw.flush(); //버퍼지우기
		        
		    }
		    // 스트릠 닫기
		    bw.close();
		    br.close();
		    
		    System.out.println("[클라이언트가 접속되었습니다.]");
		}
		catch (Exception e){
			e.printStackTrace();
		    	
		    }finally {
		    	try {
		    		serverSocket.close();
		    		
		    	}catch(Exception e) {
		    		e.printStackTrace();
		    	}
		    }

	}

}
