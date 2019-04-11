package com.PPNet.UserController;

import java.util.List;
import com.PPNet.pojo.User;

public interface UserControllerInterface {
	public int registerNewUser2Database();
	public int UpdateUser();
	public User findUser(String userID);
	public int addFriend(String userID);
	public int deleteFriend(String userID);
	public List<User> getFriendList(String userID);
}
