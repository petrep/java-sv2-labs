package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
	private List<MeetingRoom> meetingRooms = new ArrayList<>();

	public void addMeetingRoom(MeetingRoom meetingRoom) {
		meetingRooms.add(meetingRoom);
	}

	public void printNames() {
		if (meetingRooms.size() > 0) {
			String meetingRoomList = "";
			for (MeetingRoom currentMeetingRoom : meetingRooms) {
				meetingRoomList += currentMeetingRoom.getName();
				meetingRoomList += ", ";
			}
			System.out.println(meetingRoomList.substring(0, meetingRoomList.length()-2));
		}
	}

	public void printNamesReverse() {
		for (int i = meetingRooms.size() - 1; i >= 0; i--) {
			System.out.println(meetingRooms.get(i).getName());
		}
	}

	public void printEvenNames() {
		for (int i = 0; i < meetingRooms.size(); i += 2) {
			System.out.println(meetingRooms.get(i).getName());
		}
	}

	public void printAreas() {
		System.out.println("A tárgyalók részletes adatai:");
		for (int i = 0; i < meetingRooms.size(); i++) {
			System.out.println("A tárgyaló neve: " + meetingRooms.get(i).getName());
			printDataOfARoom(meetingRooms.get(i));
		}
	}

	public void printDataOfARoom(MeetingRoom meetingRoom) {
		System.out.println("Szélesség(m): " + meetingRoom.getWidth());
		System.out.println("Hosszúság(m): " + meetingRoom.getLength());
		System.out.println("Terület(m2): " + meetingRoom.getArea());
	}

	public void printMeetingRoomsWithName(String name) {
		System.out.println("Keresés pontos név alapján..");
		for (MeetingRoom currentMeetingRoom : meetingRooms) {
			if (currentMeetingRoom.getName().equals(name))
				printDataOfARoom(currentMeetingRoom);
		}
	}

	public void printMeetingRoomsContains(String part) {
		System.out.println("Keresés névtöredék alapján..");
		String roomNameKeyWord = part.toLowerCase();
		for (MeetingRoom currentMeetingRoom : meetingRooms) {
			if (currentMeetingRoom.getName().contains(roomNameKeyWord))
				printDataOfARoom(currentMeetingRoom);
		}
	}

	public void printAreasLargerThan(int area) {
		System.out.println("Keresés terület alapján..");
		for (MeetingRoom currentMeetingRoom : meetingRooms) {
			if (currentMeetingRoom.getArea() > area) {
				System.out.println(currentMeetingRoom.getName());
				printDataOfARoom(currentMeetingRoom);
			}
		}
	}
}
