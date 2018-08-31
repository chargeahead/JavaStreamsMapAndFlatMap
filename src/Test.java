import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//map
		String[] array = {"Tom","Jack","Harry"};
		Stream<String> arrayStream = Stream.of(array);
		arrayStream.map(e -> e.length())
		.forEach(e -> System.out.println(e));

	}

}
