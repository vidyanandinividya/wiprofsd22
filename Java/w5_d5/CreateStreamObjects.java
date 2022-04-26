package w5_d5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


public class CreateStreamObjects {

	public static void main(String[] args) {
		//create a stream
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
		//stream.forEach(x->System.out.println(x));
		//create a stream from sources
		
		Collection<String> collection=Arrays.asList("john","Jack","Tom","Hary");
		Stream<String> stream2=collection.stream();
		stream2.forEach(System.out::println);
		List<String> list=Arrays.asList("john","Jack","Tom","Hary");
		Stream<String> stream3=collection.stream();
		stream2.forEach(System.out::println);
		
		
	}

}
