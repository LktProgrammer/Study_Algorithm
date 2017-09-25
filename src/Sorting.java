
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
	
	public int[] Quick_Sort(int[] data,int left,int right)
	{
		int pivot_index = left;
		int pivot = data[pivot_index];
		int hold_left = left;
		int hold_right = right;
		
		left++;


		while(right>=left)
		{
			while(left<=right &&data[left]<=pivot)
			{
				left++;
			}
			while(data[right]>=pivot && left<=right)
				right--;
			if(left <=right)
			{
				int tmp = data[left];
				data[left] = data[right];
				data[right]  = tmp;
			}

		}

		int tmp =data[pivot_index];
		data[pivot_index] = data[right];
		data[right]=tmp;
		
		if(right >hold_left)
			data = Quick_Sort(data,hold_left,right-1);
		
		if(hold_right>right)
			data= Quick_Sort(data,right+1,hold_right);
		
		return data;
	}
	
	public int[] Merge_Sort(int[] data,int first,int last)
	{			
		if(last>first)
		{
			int middle = (first+last)/2;	
			Merge_Sort(data,first,middle);
			Merge_Sort(data,middle+1,last);
			Sort(data,first,middle,last);
		}
		return data;
	}
	
	public void Sort(int[] data, int first,int middle, int last)
	{
		int tmp_arr[] = new int[10];	//�պ� ���� �ӽ� ���� 
		int left_start = first;			//�п��� ���� �迭 ����
		int tmp_index = first;			//�պ� �Ǵ� �迭�� ���� 
		int right_start = middle+1;		//�п��� ������ �迭 ����
		
		while(left_start<=middle && right_start <= last)	//���� �迭�� ������ �迭 ���ʴ�� ���Ͽ� �ӽù迭�� �ֱ�
		{
			if(data[left_start] < data[right_start])		//���� �迭�� ���Ұ� ���� ��� 
			{
				tmp_arr[tmp_index] = data[left_start];
				left_start++;
			}
			else											//������ �迭�� ���Ұ� ���� ���
			{
				tmp_arr[tmp_index] = data[right_start];
				right_start++;
			}
			tmp_index++;
		}
			while(left_start<=middle)						//���� �迭�� ���� ���Ұ� ���� ���
			{
				tmp_arr[tmp_index] = data[left_start];
				left_start++;
				tmp_index++;
			}
			while(right_start<=last)						//������ �迭�� ���Ұ� ���� ���
			{
				tmp_arr[tmp_index] = data[right_start];
				right_start++;
				tmp_index++;
			}
		
		for(int i=first;i<=last;i++)						//���� �迭�� �ֱ�
		{
			data[i] = tmp_arr[i];
		}
	}
}
