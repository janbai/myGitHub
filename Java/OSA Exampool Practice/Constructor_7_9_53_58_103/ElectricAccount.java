package Constructor_7_9_53_58_103;
//Q009

public class ElectricAccount {
	private double kWh;
	private double rate = 0.07;
	private double bill;
	// line n1
	public void addKWh(double kWh){
		if(kWh > 0){
		this.kWh += kWh;
		this.bill = this.kWh * this.rate;
		}
		}
}