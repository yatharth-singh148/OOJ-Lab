//q3 lab9
import java.util.Scanner;
interface stackop
{
        void push(int item);
        int pop();
	void display();
}
class FixedStack implements stackop
{
        private int stk[] = new int[5];
        private int tos=-1;
	private int size = 5;
	
        public void push(int item)
        {
                if(tos==size-1)
                {
                        System.out.println("Stack Overflow");
                }
                else
                        stk[++tos]=item;
        }
        public int pop()
        {
                if(tos<0)
                {
                        System.out.println("Stack Underflows");
                        return 0;
                }
                else
                        return stk[tos--];
        }
	public void display()
	{
		System.out.println("Stack: ");
		for(int i=0;i<5;i++){
		System.out.println("\t"+stk[i]); }}

	public static void main(String args[]){ 
		int ch,e;
		FixedStack o = new FixedStack();
		for(int j=0;j<tos;j++)
{
o.stk[j]=-1;
}
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Enter choice:\n1 -> Push\n2 -> Pop\n3 -> Display\n4 -> Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: System.out.print("Enter element to be pushed: "); e=sc.nextInt(); o.push(e); break;
			case 2: o.pop(); break;
			case 3: o.display(); break;
			case 4: java.exit(0); break;
			default: System.out.println("Enter valid option!");
		} }}
		
}
