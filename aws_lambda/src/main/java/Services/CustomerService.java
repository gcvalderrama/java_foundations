package Services;

import Core.CustomerAddress;
import Core.CustomerEntity;
import Repositories.CustomerRepository;

import java.lang.reflect.Array;

public class CustomerService {

    private CustomerRepository  repository;
    public CustomerService(){
        this.repository = new CustomerRepository();
    }

    public void Dowork(){
        Object a = this.repository.get_state();
        CustomerEntity entity = new CustomerEntity();

        entity.customerAddress = (CustomerAddress)a;

    }

}
