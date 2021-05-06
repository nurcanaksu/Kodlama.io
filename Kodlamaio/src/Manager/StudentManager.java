package Manager;

import Entity.Student;
import SendOperations.Member;

public class StudentManager extends AbstractClass<Student> {


	private Member members;

	public StudentManager(Member members) {
		super();
		this.members = members;
	}
	

	@Override
	public void Add(Student student)
	{
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " Sisteme ��renci olarak eklendi.");
		this.members.send(student.getFirstName());
	}
	
	@Override
	public void Delete(Student student)
	{
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " Adl� ��renci sistemden silindi");
		this.members.send(student.getFirstName());
	}
	
}
