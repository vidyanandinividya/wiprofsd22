package w4_d5.generics;

public class GenericList<T extends Number> {
	private T[] items=(T[])new Object[10];
	private int count;
	public void add(T item)
	{
		items[count++]=item;
	}
	public T get(int index)
	{
		return items[index];
	}

}
