
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
		int tmp_arr[] = new int[10];	//합병 정렬 임시 저장 
		int left_start = first;			//분열된 왼쪽 배열 시작
		int tmp_index = first;			//합병 되는 배열의 시작 
		int right_start = middle+1;		//분열된 오른쪽 배열 시작
		
		while(left_start<=middle && right_start <= last)	//왼쪽 배열과 오른쪽 배열 차례대로 비교하여 임시배열에 넣기
		{
			if(data[left_start] < data[right_start])		//왼쪽 배열의 원소가 작을 경우 
			{
				tmp_arr[tmp_index] = data[left_start];
				left_start++;
			}
			else											//오른쪽 배열의 원소가 작을 경우
			{
				tmp_arr[tmp_index] = data[right_start];
				right_start++;
			}
			tmp_index++;
		}
			while(left_start<=middle)						//왼쪽 배열에 아직 원소가 남은 경우
			{
				tmp_arr[tmp_index] = data[left_start];
				left_start++;
				tmp_index++;
			}
			while(right_start<=last)						//오른쪽 배열에 원소가 남은 경우
			{
				tmp_arr[tmp_index] = data[right_start];
				right_start++;
				tmp_index++;
			}
		
		for(int i=first;i<=last;i++)						//원래 배열에 넣기
		{
			data[i] = tmp_arr[i];
		}
	}
}
