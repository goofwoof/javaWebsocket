package com.PPNet.MessageController;

import java.util.List;

import com.PPNet.pojo.Chatroommessage;
import com.PPNet.pojo.Message;

public interface MessageControllerInterface {
	public void loadUserMessage(Message message);
	public List<Message> catchHestoryMessage(String UserID);
	public void loadChatRoomMessage(Chatroommessage chatroommessage);
	public List<Chatroommessage>catchHestoryChatRoomMessage(String chatroomid);
}
