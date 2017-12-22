package project.v1b;

public interface CustomerService {
	void addCustomerService(CustomerVO c);

	String getCustomerService();

	String getCustomerService(String cName);

	void modifyCustomerService(CustomerVO c);

	void removeCustomerService(String cName);

}
