package dao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import model.Friend;

public class FriendDao {
	
	private List<Friend> friends = new LinkedList<Friend>();
	
	public FriendDao() {
		// init Friends
		friends.add(new Friend(1,"Tinda", "https://dl.dropbox.com/u/35626089/zk_picture/1346822508_rabbit_animal_pink_murder.png","1990/09/11","0988123456","tinda@gmail.com",1));
		friends.add(new Friend(2,"Roli", "https://dl.dropbox.com/u/35626089/zk_picture/1346822513_rabbit_animal_pink_cute.png","1970/01/11","0911123456","roli@gmail.com",1));
		friends.add(new Friend(3,"Tony", "https://dl.dropbox.com/u/35626089/zk_picture/1346823179_rabbit_animal_white.png"));
		friends.add(new Friend(4,"Jumper", "https://dl.dropbox.com/u/35626089/zk_picture/1346823196_rabbit_animal_pink_smile.png"));
		friends.add(new Friend(5,"Jason", "https://dl.dropbox.com/u/35626089/zk_picture/1346823207_rabbit_animal_pink.png"));
		friends.add(new Friend(6,"Jetty", "https://dl.dropbox.com/u/35626089/zk_picture/1346823208_rabbit_animal_green.png"));
		friends.add(new Friend(7,"Fox", "https://dl.dropbox.com/u/35626089/zk_picture/1346826184_t9foxy_trans.png"));
		friends.add(new Friend(8,"Lion", "https://dl.dropbox.com/u/35626089/zk_picture/1346826831_t9lion_trans.png"));
//		this.setFriends(Arrays.asList(new Friend[] {
//			new Friend(1,"Tinda", "https://dl.dropbox.com/u/35626089/zk_picture/1346822508_rabbit_animal_pink_murder.png","1990/09/11","0988123456","tinda@gmail.com",1),
//			new Friend(2,"Roli", "https://dl.dropbox.com/u/35626089/zk_picture/1346822513_rabbit_animal_pink_cute.png","1970/01/11","0911123456","roli@gmail.com",1),
//			new Friend(3,"Tony", "https://dl.dropbox.com/u/35626089/zk_picture/1346823179_rabbit_animal_white.png"),
//			new Friend(4,"Jumper", "https://dl.dropbox.com/u/35626089/zk_picture/1346823196_rabbit_animal_pink_smile.png"),
//			new Friend(5,"Jason", "https://dl.dropbox.com/u/35626089/zk_picture/1346823207_rabbit_animal_pink.png"),
//			new Friend(6,"Jetty", "https://dl.dropbox.com/u/35626089/zk_picture/1346823208_rabbit_animal_green.png"),
//			new Friend(7,"Fox", "https://dl.dropbox.com/u/35626089/zk_picture/1346826184_t9foxy_trans.png"),
//			new Friend(8,"Lion", "https://dl.dropbox.com/u/35626089/zk_picture/1346826831_t9lion_trans.png")
//		}));
	}
	
	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	
	public void addFriend(Friend friend) {
		this.friends.add(friend);
	}
	
	public void removeFriend(int id) {
		
		for(Friend friend : friends) {
			if(friend.getId() == id) 
			{
				friends.remove(friend);
				break;
			}
		}
	}
	
	public Friend findFriendByID(int id) {
		for(Friend friend : friends) {
			if(friend.getId() == id) 
			{
				return friend;
			}
		}
		return null;
	}

	public List<Friend> getAllFriends() {
		return Arrays.asList(new Friend[] {
			new Friend(1,"Tinda", "https://dl.dropbox.com/u/35626089/zk_picture/1346822508_rabbit_animal_pink_murder.png"),
			new Friend(2,"Roli", "https://dl.dropbox.com/u/35626089/zk_picture/1346822513_rabbit_animal_pink_cute.png"),
			new Friend(3,"Tony", "https://dl.dropbox.com/u/35626089/zk_picture/1346823179_rabbit_animal_white.png"),
			new Friend(4,"Jumper", "https://dl.dropbox.com/u/35626089/zk_picture/1346823196_rabbit_animal_pink_smile.png"),
			new Friend(5,"Jason", "https://dl.dropbox.com/u/35626089/zk_picture/1346823207_rabbit_animal_pink.png"),
			new Friend(6,"Jetty", "https://dl.dropbox.com/u/35626089/zk_picture/1346823208_rabbit_animal_green.png"),
			new Friend(7,"Fox", "https://dl.dropbox.com/u/35626089/zk_picture/1346826184_t9foxy_trans.png"),
			new Friend(8,"Lion", "https://dl.dropbox.com/u/35626089/zk_picture/1346826831_t9lion_trans.png")
		});
	}

}
