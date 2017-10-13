
public class Main {
	public static void main(String[] args)
	{
		Circular_Queue queue = new Circular_Queue(5);
		queue.EnQueue(5);
		queue.EnQueue(5);
		queue.EnQueue(5);
		queue.EnQueue(5);

		queue.DeQueue();
		queue.DeQueue();
		queue.DeQueue();
		queue.DeQueue();

		queue.EnQueue(5);
		queue.EnQueue(5);
		queue.EnQueue(5);
		queue.EnQueue(5);
		queue.EnQueue(5);


		

	}

}
/*Sorting sort = new Sorting();
sort.Shell_Sort(data,data.length);
for(int i=0;i<data.length;i++)
{
	System.out.print(data[i]+",");

}*/

