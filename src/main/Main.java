package main;

import bridge.BankBridge;
import bridge.ProviderBridge;
import bridge.StoreBridge;
import core.BankImpl;
import core.Client;
import core.ProviderImpl;
import core.StoreImpl;

public class Main {

	public static void main(String[] args) {
		ProviderBridge prov = new ProviderImpl();
		BankBridge bank = new BankImpl();
		StoreBridge storeImpl = new StoreImpl(prov,bank);
		Client cl = new Client(storeImpl);
		
		cl.run();

	}

}
