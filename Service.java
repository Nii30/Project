

import java.util.Scanner;

public class Service 
{
	Product[] arr;
	int k=0;
	Scanner sc=new Scanner(System.in);
	
	public void createDatabse(int size)
	{
		arr= new Product[size];
		System.out.println("Database has been created of size: "+size);
	}
	
	public void addProduct()
	{
		System.out.println("=========Adding the Product Details=========");
		if(k==arr.length)
		{
			System.out.println("=========DataBase is Full=========");
		}
		else 
		{
			System.out.println("Enter the Product ID: ");
			int pId=sc.nextInt();
			System.out.println("Enter the Product Name: ");
			String pName=sc.next();
			System.out.println("Enter the Product Price: ");
			double price=sc.nextDouble();
			System.out.println("Enter the Product Brand: ");
			String brand=sc.next();
			System.out.println("Enter the Product Quantity: ");
			int qty=sc.nextInt();
			Product p=new Product(pId, pName, price, brand, qty);
			arr[k]=p;
			System.out.println("=======================================================");
			System.out.println("=========Product Details Added to Database=========");
			k++;
		}
		System.out.println("=======================================================");
	}
	
	public void findByID()
	{
		System.out.println("=================Finding the Details..==================");
		System.out.println("Enter the Product ID: ");
		boolean b=true;
		int pId=sc.nextInt();
		for (Product ele: arr) 
		{
			if(ele.getPid()==pId)
			{
				System.out.println("=====Product Details Found=====");
				System.out.println("Product ID: "+ele.getPid());
				System.out.println("Name: "+ele.getPname());
				System.out.println("Price: "+ele.getPrice());
				System.out.println("Company: "+ele.getCompany());
				System.out.println("Quantity: "+ele.getQty());
				b=false;
				break;
			}
			
		}
		if(b==true)
		{
			System.out.println("ID NOT FOUND");
		}
	}
	
//	public void findByBrand()
//	{
//		System.out.println("=================Finding the Details..==================");
//		System.out.println("Enter the Product Brand: ");
//		boolean b=true;
//		String brand=sc.next();
//		for (Product ele: arr) 
//		{
//			if(ele.getCompany()==brand)
//			{
//				System.out.println("=====Product Details Found=====");
//				System.out.println("Product ID: "+ele.getPid());
//				System.out.println("Name: "+ele.getPname());
//				System.out.println("Price: "+ele.getPrice());
//				System.out.println("Brand: "+ele.getCompany());
//				System.out.println("Quantity: "+ele.getQty());
//				b=false;
//				break;
//			}
//			
//		}
//		if(b==true)
//		{
//			System.out.println("BRAND NOT FOUND");
//		}	
//	}
	
	public void update()
	{
		System.out.println("=================Updating the Details..==================");
		System.out.println("Enter the Product ID: ");
		boolean b=true;
		int pId=sc.nextInt();
		for(Product ele: arr)
		{
			if(ele.getPid()==pId)
			{
				System.out.println("====Choose from the MENU Which Details You Wnat to Update====");
				System.out.println("1. Product ID\n2. Name\n3. Price\n4. Brand\n5. Quantity");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				int n3=sc.nextInt();
				int n4=sc.nextInt();
				int n5=sc.nextInt();
				if(n1==1)
				{
					System.out.println("Enter the Updated Product ID");
					int pid=sc.nextInt();
					ele.setPid(pid);
				}
				if(n2==2)
				{
					System.out.println("Enter the Updated Product Name");
					String pName=sc.next();
					ele.setPname(pName);
				}
				if(n3==3)
				{
					System.out.println("Enter the Updated Product Price");
					double price=sc.nextDouble();
					ele.setPrice(price);
				}
				if(n4==4)
				{
					System.out.println("Enter the Updated Product Brand");
					String brand=sc.next();
					ele.setCompany(brand);
				}
				
				if(n5==5)
				{
					System.out.println("Enter the Updated Product Quantity");
					int qty=sc.nextInt();
					ele.setQty(qty);
				}
				
				System.out.println("=====Product Details Updated=====");
				System.out.println("Product ID: "+ele.getPid());
				System.out.println("Name: "+ele.getPname());
				System.out.println("Price: "+ele.getPrice());
				System.out.println("Brand: "+ele.getCompany());
				System.out.println("Quantity: "+ele.getQty());
				b=false;
				break;
				
			}
		}
		if(b==true)
		{
			System.out.println("ID NOT FOUND");
		}
	}
	
	
	public void details()
	{
		for(Product ele: arr)
		{
			System.out.println("=====Getting All the Product Details Found=====");
			System.out.println("=======================================================");
			System.out.println("P ID\tName\tPrice\tBrand\tQuantity");
			System.out.println("=======================================================");
			System.out.println(ele.getPid()+"\t"+ele.getPname()+"\t"+ele.getPrice()+"\t"+ele.getCompany()+"\t"+ele.getQty());
			System.out.println("=======================================================");
		}
	}

	public void delete() {
	
		
	}
}
