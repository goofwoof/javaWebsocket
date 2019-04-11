package com.PPNet.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.PPNet.pojo.Message;

import net.sf.json.JSONObject;

public class ServerIml implements ServerInterface {
	private int ListenerPort=-1;
	private int MaxSocketThread=-1;
	ServerSocket serverSocket;
	private Map<String,Socket> OnlineUserSocket;
	@Override
	public void startUp() throws IOException {
		// TODO Auto-generated method stub
		serverSocket = new ServerSocket(ListenerPort);
	}

	@Override
	public void initialServer(int ListenerPort, int MaxSocketThread) {
		// TODO Auto-generated method stub
		this.ListenerPort = ListenerPort;
		this.MaxSocketThread = MaxSocketThread;
		this.OnlineUserSocket = new HashMap<String,Socket>();
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		while (true) {    
            //从请求队列中取出一个连接
            Socket client = null;
			try {
				client = serverSocket.accept();
				// 处理这次连接
				ServerThread th = new ServerThread(client,this);  
                th.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("服务器异常: " + e.getMessage()); 
			}           
        }
	}  
	private void addOnLineUser(String userid, Socket sk) throws IOException {
		if(this.OnlineUserSocket.get(userid) == null)
			this.OnlineUserSocket.put(userid, sk);
		returnOK(sk);
	}
	private void returnOK(Socket sk) throws IOException {
		PrintWriter wtr = new PrintWriter(sk.getOutputStream()); 
		wtr.println("{\"result\"=\"200\"}");
		wtr.flush();
	}
	private void offLineUser(String userid,Socket sk) throws IOException {
		this.OnlineUserSocket.remove(userid, sk);
		sk.close();
	}
	private void registerUser(JSONObject json_test, Socket sk) {
		
	}
	private void creatChatRoom(JSONObject json_test, Socket sk) {
		
	}
	private void destoryChatRoom(String ChatRoomNumber) {
		
	}
	private void captureNewMessage(JSONObject json_test, Socket sk) {
		
	}
	private void sendMessage(Message message) {
		
	}

	@Override
	public void errorStorage() {
		// TODO Auto-generated method stub
		try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class ServerThread extends Thread  
	{  
		Socket sk = null;  
	    BufferedReader rdr = null;   
	    ServerIml server = null;
	    public ServerThread(Socket sk,ServerIml server)  
	    {  
	        this.sk = sk;
	        this.server = server;
	    }  
	    public void run()  
	    {  
	        try  
	        {   
	            rdr = new BufferedReader(new InputStreamReader(sk  
	                    .getInputStream()));  
	            String line = rdr.readLine();
	            System.out.println("从客户端来的信息：" + line);   
	            stringtoJson(line);
	        }  
	        catch (IOException e)  
	        {  
	            e.printStackTrace();  
	        }  
	          
	    }
		private void stringtoJson(String json) throws IOException {
			// TODO Auto-generated method stub
			JSONObject json_test = JSONObject.fromObject(json);
			int type = (int)json_test.get("type");
			switch(type) {
			case 0://注册类消息
				server.registerUser(json_test,sk);
				break;
			case 1://登录、注销
				if(json_test.getBoolean("action"))
					server.addOnLineUser(json_test.getString("userid"),sk);
				else server.offLineUser(json_test.getString("userid"),sk);
				break;
			case 2://发起聊天室
				server.creatChatRoom(json_test,sk);
				break;
			case 3://私人消息
				server.captureNewMessage(json_test,sk);
				break;
			case 4://聊天室消息
				server.captureNewMessage(json_test,sk);
				break;
			}
		}
	      
	}
}

  
