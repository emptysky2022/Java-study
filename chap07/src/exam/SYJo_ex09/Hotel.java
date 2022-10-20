package exam.SYJo_ex09;

import java.util.ArrayList;

public class Hotel {
	ArrayList<Room> rooms = new ArrayList<>();

	class Room {
		int num;
		String name;

		Room(int num, String name) {
			this.name = name;
			this.num = num;
		}

		void show() {
			System.out.println(num + "번 방을 " + name + "가 예약했습니다.");
		}
	}

	void add(int num, String name) {
		rooms.add(new Hotel.Room(num, name));
	}

	void show() {
		for (Room r : rooms)
			r.show();
	}

}
