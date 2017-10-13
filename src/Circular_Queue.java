
public class Circular_Queue {
	int rear = 0;
	int front = 0;
	int maxsize = 0;
	int[] circular_Queue;
	
	public Circular_Queue(int maxsize)
	{
		this.maxsize = maxsize;
		circular_Queue = new int[this.maxsize];
	}
	
	public boolean Isempty()
	{
		if(rear == front)
		{
			return true;
		}
		return false;
	}
	public boolean Isfull()
	{
		if((rear+1)%maxsize == front)
		{
			return true;
		}
		return false;
	}
	
	public void EnQueue(int num)
	{
		if(Isfull())
		{
			System.out.println("Å¥°¡ °¡µæ Ã¡½À´Ï´Ù");
		}
		else
		{
			rear = (rear+1) % maxsize;
			circular_Queue[rear]=num;
		}
	}
	
	public int DeQueue()
	{
		if(Isempty())
		{
			return -1;
		}
		else
		{
			front = (front+1)%maxsize;
			return circular_Queue[front];
		}
	}

}
