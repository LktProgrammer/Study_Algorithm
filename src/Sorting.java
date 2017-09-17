
public class Sorting {
	

	public int[] Insertion_Sort(int[] data,int num)
	{
		int tmp,i,j;
		for(i=1;i<data.length;i++)
		{
			tmp = data[i];
			for(j=i-1;tmp>data[j]&&j>=0;j--)
			{
				data[j+1] = data[j];
			}
			data[j+1] = tmp;
		}
		return data;
	}
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
	public int[] Bubble_Sort(int[] data,int num)
	{
		int tmp;
		for(int i=0;i<num-1;i++)
		{
			for(int j=0;j<=num-2-i;j++)
			{
				if(data[j]>data[j+1])
				{
					tmp=data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				}
			}
		}
		return data;
	}
	
}
