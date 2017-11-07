
public class Circular_Queue {
	
	int rear = 0;			//���� 0�������� ����
	int front = 0;			//���� 0�������� ����
	int maxsize = 0;		//�迭�� ũ��
	int[] circular_Queue;	//�迭
	
	public Circular_Queue(int maxsize)
	{
		this.maxsize = maxsize;
		circular_Queue = new int[this.maxsize];
	}
	
	public boolean Isempty()	//�迭�� ���� �������� üũ�ϴ� �޼����Դϴ�.
	{
		if(rear == front)
		{
			return true;
		}
		return false;
	}
	public boolean Isfull()		//�迭�� ��ȭ �������� üũ�ϴ� �޼����Դϴ�.
	{
		if((rear+1)%maxsize == front)
		{
			return true;
		}
		return false;
	}
	
	public void EnQueue(int num)
	{
		if(Isfull())			//�迭�� ��ȭ�����ϰ��
		{
			System.out.println("ť�� ���� á���ϴ�");
		}
		else					//�迭�� ��ȭ���°� �ƴҰ��
		{
			rear = (rear+1) % maxsize;
			circular_Queue[rear]=num;
		}
	}
	
	public int DeQueue()
	{
		if(Isempty())			//�迭�� ��������̸� -1��ȯ
		{
			return -1;
		}
		else					//�迭�� ������°� �ƴ϶��
		{
			front = (front+1)%maxsize;
			return circular_Queue[front];
		}
	}

}
