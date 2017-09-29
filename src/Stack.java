
public class Stack {
	
	int maxsize = 0;
	int top = 0;
	int[] stack;
	
	public Stack(int maxsize)	//생성자에서 스택 사이즈 지정
	{
		this.maxsize=maxsize;
		stack = new int[maxsize];
	}
	
	public void Push(int number)	//push 데이터 삽입, maxsize보다 작을 경우에만
	{
		if(top < maxsize)
		{
			stack[top] = number;
			top++;
		}
		else
		{
			System.out.println("오버플로우");
		}
	}
	
	public Object Pop()			//top이 가르키는 위치의 원소를 반환
	{
		if(top > 0 )
		{
			return stack[--top];
		}
		else
		{
			System.out.println("스택에 데이터가 존재하지 않습니다.");
			return null;
		}
	}
}
