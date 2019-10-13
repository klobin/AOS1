import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScheduleAlgo {
	public static void main(String[] args) {
		List<Process> inputs = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			inputs.add(getRandomProcess());
		}
		inputs.stream().sorted().forEach(i -> System.out.println(i.arrivalTime + " " + i.runTime + " " + i.priority));
	}

	private static Process getRandomProcess() {
		return new Process(generateRandomInRange(0, 99), generateRandomInRange(1, 10), generateRandomInRange(1, 4));
	}

	private static int generateRandomInRange(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}
}
