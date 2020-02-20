package Task_4.Clean_code;
public class GenerateBill {
	public double totalcost(String name,double Sqrfoot)
	{
		GetHouseType housetype = new GetHouseType();
		TotalAmount total = housetype.getPlan(name);  
		total.getRate();
		double d=total.calculateBill(Sqrfoot);
		return d;
	}

}