package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s= new GSShopFactory();
		PrimeAcc p= new GSPrimeAcc (1234,"shrija", 289,true);
		NormalAcc n=new GSNormalAcc(3456,"riddhi",345,150);
		System.out.println("prime account: ");
		p.bookProduct(p.getCharges());
		System.out.println("normal account: ");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);

	}

}
