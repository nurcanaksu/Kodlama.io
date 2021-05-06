package SendOperations;

public class EmailSend implements Member {

	@Override
	public void send(String Name) {
		System.out.println(Name + " Adlı kişiye E mail gönderildi..");
		
	}

}
