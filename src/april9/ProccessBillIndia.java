package april9;

public class ProccessBillIndia  extends ProccessBill{
	
@Override
double calTotalBill(double totalamount) {
	double cgst = totalamount*0.09;
	double sgst = totalamount*0.09;
	
	double r = totalamount +cgst +sgst;
	return r;
}

}
