package kodlamaio;

import Entity.Instructor;
import Entity.Student;
import Entity.User;
import Manager.InstructorManager;
import Manager.StudentManager;
import Manager.UserManager;
import SendOperations.EmailSend;
import SendOperations.SmsSend;

public class Main {

	public static void main(String[] args) {

		
		Student student = new Student();
		student.setFirstName("Nurcan");
		student.setLastName("AKSU");
        student.setId(1);	
        student.setEmail("nurcan.aksuf@gmail.com");
		student.setNumber(51);
       
		StudentManager studentmanager = new StudentManager(new EmailSend());
		studentmanager.Add(student);
        
		User user= new User();
		user.setId(1);
		user.setFirstName("Merve");
		user.setLastName("BİNGÖL");

		UserManager usermanager= new UserManager(new SmsSend());
		usermanager.Add(user);
		
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMİROĞ");
		
		
		InstructorManager manager = new InstructorManager(new EmailSend());
		manager.Add(instructor);

	}

}
