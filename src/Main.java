
public class Main {
	public static void main(String[] args)
	{
		int data[] = {5,42,8,2,943,3,11,1,22,3444};
		Sorting sort = new Sorting();
		sort.Radix_Sort(data);

		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+",");

		}
		

	}

}
/*Sorting sort = new Sorting();
sort.Shell_Sort(data,data.length);
for(int i=0;i<data.length;i++)
{
	System.out.print(data[i]+",");

}*/

