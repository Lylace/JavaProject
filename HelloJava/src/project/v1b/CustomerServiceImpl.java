package project.v1b;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void addCustomerService(CustomerVO c) {

		System.out.println("고객정보가 등록되었습니다.");

	}

	@Override
	public String getCustomerService() {
		String out = "고객정보를 출력합니다.";
		return out;
	}

	@Override
	public String getCustomerService(String cName) {
		return cName;
	}

	@Override
	public void modifyCustomerService(CustomerVO c) {
		System.out.println("고객정보가 수정되었습니다.");

	}

	@Override
	public void removeCustomerService(String cName) {
		System.out.println("고객정보가 삭제되었습니다.");

	}

}
