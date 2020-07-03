package training;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int nb = 0;
		int position;
		ArrayList<Integer> listATrier = new ArrayList<>();
		listATrier.add(5);
		listATrier.add(3);
		listATrier.add(2);
		listATrier.add(1);
		listATrier.add(4);
		listATrier.add(7);
		int count = listATrier.size();

		ArrayList<Integer> transition = new ArrayList<>();
		for (int j = 0; j < count; j++) {
			nb = listATrier.get(0);
			position = 0;

			for (int i = 0; i < listATrier.size(); i++) {

				if (listATrier.get(i) > nb) {
					nb = listATrier.get(i);
					position = i;

				}

			}

			System.out.println(listATrier.toString());
			transition.add(nb);

			listATrier.remove(position);

		}
		System.out.println(transition.toString());
	}
}
