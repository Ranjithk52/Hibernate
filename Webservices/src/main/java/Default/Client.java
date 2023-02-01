package Default;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.ojas.producer.CalculateService;
import com.ojas.producer.CalculateServiceLocator;
import com.ojas.producer.CalculateSoapBindingStub;

public class Client {

	public static void main(String[] args) {
		try {
			CalculateService service=new CalculateServiceLocator();
			CalculateSoapBindingStub cs=(CalculateSoapBindingStub) service.getCalculate();
			System.out.println(cs.calci(12, 12));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
