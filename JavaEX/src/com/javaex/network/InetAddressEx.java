package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;



public class InetAddressEx {

	public static void main(String[] args) {
		// 내 IP 확인
		try {
		InetAddress local = InetAddress.getLocalHost();
         System.out.println("Local IP:"+local.getHostAddress());
	}catch (Exception e) {
		e.printStackTrace();
	}
	  printSeverIp("www.google.com");
	  printSeverIp("www.naver.com");
	}
	private static void printSeverIp(String hostName) {
		try {
			InetAddress[] remotes = InetAddress.getAllByName(hostName);
		     for (InetAddress remote: remotes) {
		    	 System.out.println(hostName+":"+remote.getHostAddress());
		     }
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}