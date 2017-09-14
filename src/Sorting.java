
public class Sorting {
	
	public int[] Selection_Sort(int[] data,int num)
	{
		int min,tmp;
		for(int i=0;i<num-1;i++)
		{
			min=i;
			for(int j=i+1;j<num;j++)
			{
				if(data[min]>data[j])
				{
					min=j;
				}
				tmp = data[min];
				data[min] = data[i];
				data[i] = tmp;
			}
		}
		return data;
	}

}
