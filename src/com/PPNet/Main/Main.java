package com.PPNet.Main;

import com.PPNet.Server.ServerIml;
import com.PPNet.Server.ServerInterface;

public class Main {
	private static ServerInterface  server= new ServerIml();
	public static void main(String args[]) {
		int ListenerPort = 9999;
		int MaxSocketThread = 10;
		server.initialServer(ListenerPort, MaxSocketThread);
		while(true){
			try {
				server.startUp();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("系统运行异常");
			}finally {
				server.errorStorage();
			}
			break;
		}
	}
}
