
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception e1 = new Exception();
		
		System.out.println(e1);
		Exception e2 = new Exception("First exception");
		System.out.println(e2);
		Exception e3 = new Exception(e2);
		System.out.println(e3);

		Exception e4 = new Exception("This is another excepttion",e2);
		
		System.out.println(e4);
		System.out.println(e4.getCause());
	}

}
