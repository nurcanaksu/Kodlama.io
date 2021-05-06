package Manager;

import Entity.Instructor;
import SendOperations.Member;

public class InstructorManager extends AbstractClass<Instructor> {

	private Member members;

	public InstructorManager(Member members) {
		super();
		this.members = members;
	}
	

	@Override
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " " + instructor.getLastName() + " Sisteme e�itmen olarak eklendi.");
		this.members.send(instructor.getFirstName());
		
	}

	@Override
	void Delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " " + instructor.getLastName() + " Adl� e�itmen sistemden silindi");
		this.members.send(instructor.getFirstName());
	}
		
	}

	

