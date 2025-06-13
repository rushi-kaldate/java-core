package april9Practice;

public class PBillindia extends PBill{
double CalTotalBill(double totalamount) {
	double gst = totalamount*0.09;
	double sgt = totalamount*0.09;
	
	double res = totalamount + gst + sgt;
	return res;
}	
}
