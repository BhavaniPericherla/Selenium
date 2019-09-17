package first;

public class St_Obj_mem {
    static int a =0;
    int b=1;
    public void get()
    {
    	a++;
    	System.out.println("a="+a);
    	b++;
    	System.out.println("b="+b);
    }
   
	public static void main(String[] args) {
		St_Obj_mem ob1=new St_Obj_mem();
		ob1.get();
		St_Obj_mem ob2=new St_Obj_mem();
		ob2.get();
		St_Obj_mem ob3=new St_Obj_mem();
		ob3.get();
		
	}
}
