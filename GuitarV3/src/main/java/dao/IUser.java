package dao;

import model.User;

public interface IUser {
	public void addUser(User u);
	public void deleteUser(User u);
	public User getUser(String id);

}
