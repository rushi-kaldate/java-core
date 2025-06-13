package april9;

public class ProccessBillChina extends ProccessBill {
	@Override
	double calTotalBill(double totalamount) {
		double cgst = totalamount*0.19;
		double sgst = totalamount*0.45;
		
		double r = totalamount +cgst +sgst;
		return r;
}
}