
public class Main {
	public static void main(String[] args)
	{
		int data[] = {5,4,8,2,9,3,11,1};

		Sorting sort = new Sorting();
		 data=sort.Quick_Sort(data,0,data.length-1);
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+",");
	
		}
	}

}
