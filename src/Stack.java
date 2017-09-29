
public class Stack {
	
	int maxsize = 0;
	int top = 0;
	int[] stack;
	
	public Stack(int maxsize)	//�����ڿ��� ���� ������ ����
	{
		this.maxsize=maxsize;
		stack = new int[maxsize];
	}
	
	public void Push(int number)	//push ������ ����, maxsize���� ���� ��쿡��
	{
		if(top < maxsize)
		{
			stack[top] = number;
			top++;
		}
		else
		{
			System.out.println("�����÷ο�");
		}
	}
	
	public Object Pop()			//top�� ����Ű�� ��ġ�� ���Ҹ� ��ȯ
	{
		if(top > 0 )
		{
			return stack[--top];
		}
		else
		{
			System.out.println("���ÿ� �����Ͱ� �������� �ʽ��ϴ�.");
			return null;
		}
	}
}
