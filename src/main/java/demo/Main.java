package demo;

interface Test{
	public void display(String name);
}

class Hello{
	private String str1 = "vishal";
    private String str2 = "vishal2";
    
    private String str3 = "vishal3";
    
    Test t1 = (String name) -> System.out.println(name); 
    
    Test t =new Test() {
    	@Override
    	public void display(String name) {
    		// TODO Auto-generated method stub
    		System.out.println(name);
    	} 	
    };
		
	
	Runnable r1 =() -> System.out.println(str1);
	Runnable r2=new Runnable() {
		
		@Override
		public void run() {
			System.out.println(str2);
		}
	};	
}
public class Main{
	
		public static void main(String[] args)
		{
			new Hello().r1.run();
			new Hello().r2.run();
			new Hello().t1.display("akash");;
					
		}
		
		
		
}
