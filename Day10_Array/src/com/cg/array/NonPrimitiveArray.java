package com.cg.array;

class tenants
{
	public int tenant_id;
	public String name;
	//constructor to initialize the values
	tenants(int id,String name)
	{//need to use 'this' keyword as cls and constructor names are same 
		this.tenant_id=id;
		this.name=name;
	}
}

public class NonPrimitiveArray {

	public static void main(String[] args) {
		// declaring array of class type i.e can contain diff data types given in cls
		tenants arr[]=new tenants[4];
		arr[0]=new tenants(1,"siddhi");
		arr[1]= new tenants (2,"rashmi");
		arr[2]=new tenants (3,"sushma");
		arr[3]= new tenants(4,"mona");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].name);
		}

	}

}
