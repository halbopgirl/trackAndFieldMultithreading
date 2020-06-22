package trackAndFieldMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TrackAndField extends Thread implements Runnable {
	static Coordinator cognixia = new Coordinator("Cognixia", "Coordinator", 20);
	static Trainer subbu = new Trainer("Subbu", "Trainer", 40);
	static Participant lindsay = new Participant("Lindsay", "Shotput Queen", 33);
	static Participant jayde = new Participant("Jayde", "Miler", 29);
	static Participant colette = new Participant("Colette", "High Jump Champion", 26);
	static Participant haley = new Participant("Haley", "Sprinter", 24);
	static Participant[] participants = {lindsay, jayde, colette, haley};
	public static void main(String[]args) {
		cognixia.joining();
		subbu.joining();
		cognixia.startup();
		subbu.lecture();
		goParticipants();
	}


	public static void goParticipants() {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		for (Participant participant : participants) {
			Thread t1 = new Thread() {
				public void run() {
					participant.joining();
					participant.practice();
					participant.end();
				}
			};
			pool.execute(t1);
		}
		pool.shutdown();
		subbu.end();
		cognixia.end();
	}
}
