package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxes = 3976000*1.4;
		totalTaxes=totalTaxes-250000;
		return totalTaxes;
	}
	
}
