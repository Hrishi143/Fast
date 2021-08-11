
public class link
{
   node head;
   public void insert(int data)
   {
	   node a=new node();
	   a.data=data;
	   a.next=null;
	   
	   if(head==null)
	   {
		   head = a;
		   
	   }
	   else
	   {
		   node b=head;
           while(b.next!=null)
           {
        	   b=b.next;
           }
           b.next= node;
	   }
      
    }
   public void show()
   {
	   node x= head;
	   do 
	   {
		   System.out.println(x.data);
		   x=x.next;
	   }while(x.next!=null);
   }
}
