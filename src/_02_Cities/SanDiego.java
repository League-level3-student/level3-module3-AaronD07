package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxes = population*1.6;
		totalTaxes=totalTaxes+1000000;
		return totalTaxes;	}
}
