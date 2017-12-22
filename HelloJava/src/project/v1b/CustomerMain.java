package project.v1b;

public class CustomerMain {

	public static void main(String[] args) {

		CustomerService cs = new CustomerServiceImpl();

		CustomerVO c = new CustomerVO(1, "박지성", "810101-1xxxxx", "영국 런던", "000-5000-0001");

		cs.addCustomerService(c);
		System.out.println(c);

		c = new CustomerVO(1, "박지성", "810101-100000", "영국 런던", "000-5000-0001");
		cs.modifyCustomerService(c);

		cs.removeCustomerService("박지성");
	}

}
