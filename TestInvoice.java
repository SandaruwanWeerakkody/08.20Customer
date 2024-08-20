public class TestInvoice{
	public static void main (String args[]){
		Customer c1 = new Customer(120,"Sandaruwan",20);
		Customer c2 = new Customer(157,"Udara",15);
		Invoice i1 = new Invoice(16,c1,5000);
		Invoice i2 = new Invoice(13,c2,10000);
		System.out.println(i1.toString());
		c1.setDiscount(25);
		System.out.println(i1.toString());
		i1.setCustomer(c2);
		System.out.println(i1.toString());
		System.out.println(i2.toString());
	}
}
