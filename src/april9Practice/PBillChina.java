package april9Practice;

public class PBillChina extends PBill{
	double CalTotalBill(double totalamount) {
		double gst = totalamount *0.19;
		double sgt = totalamount *0.45;
		
		double res = totalamount + gst + sgt;
		return res;
	}
}
