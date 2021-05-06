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
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " Sisteme öğrenci olarak eklendi.");
		this.members.send(student.getFirstName());
	}
	
	@Override
	public void Delete(Student student)
	{
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " Adlı öğrenci sistemden silindi");
		this.members.send(student.getFirstName());
	}
	
}
