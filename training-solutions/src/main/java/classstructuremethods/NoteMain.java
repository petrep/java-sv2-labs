package classstructuremethods;

public class NoteMain {
	public static void main(String[] args) {
		Note myNote = new Note();
		myNote.setName("Pityu");
		myNote.setTopic("Házimunkák");
		myNote.setText("Vasalás, Leckeírás");

		System.out.println(myNote.getNoteText("Pityu"));
	}
}
