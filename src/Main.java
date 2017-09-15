
public class Main {
	public static void main(String[] args)
	{
		int data[] = {5,4,3,2,1};
		Sorting sort = new Sorting();
		data =sort.Insertion_Sort(data, 5);
		for(int i=0;i<5;i++)
		{
			System.out.println(data[i]);
		}
	}

}
