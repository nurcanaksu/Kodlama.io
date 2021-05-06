package Manager;

import Entity.User;
import SendOperations.Member;

public class UserManager extends AbstractClass<User> {

	private Member members;

	public UserManager(Member members) {
		super();
		this.members = members;
	}

	@Override
	public void Add(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Adlý kullanýcý sisteme eklendi");
		this.members.send(user.getFirstName());
	}

	@Override
	public void Delete(User user) {
       System.out.println(user.getFirstName() + " " + user.getLastName() + " Adlý kullanýcý sistemden silindi.. ");
	   this.members.send(user.getFirstName());
	}
}
