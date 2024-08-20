public class TestCostomer{
	public static void main (String args[]){
		Customer c1 = new Customer(105,"Sandaruwan",20);
		System.out.println(c1.toString());
		c1.setDiscount(25);
		System.out.println(c1.toString());
	}
}
