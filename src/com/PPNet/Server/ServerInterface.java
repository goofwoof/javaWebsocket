package com.PPNet.Server;

public interface ServerInterface {
	public void startUp() throws Exception;
	public void initialServer(int ListenerPort, int MaxSocketThread);
	public void listen();
	public void errorStorage();
}
