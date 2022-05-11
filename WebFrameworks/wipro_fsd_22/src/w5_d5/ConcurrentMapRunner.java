package w5_d5;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;


public class ConcurrentMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConcurrentMap<Character,LongAdder> occurences=new ConcurrentHashMap<>();
String str="ABCD ABCD AABCD";
for(char character:str.toCharArray())
{
	/*LongAdder longAdder=occurences.get(character);
	if(longAdder==null)
	{
		longAdder=new LongAdder();
	}
	longAdder.increment();
	occurences.put(character, longAdder);*/
	occurences.computeIfAbsent(character,ch->new LongAdder()).increment();
}
System.out.println(occurences);
	}

}
