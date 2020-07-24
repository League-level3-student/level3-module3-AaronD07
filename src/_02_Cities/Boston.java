package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxes = population*6.25;
		totalTaxes=totalTaxes -population*0.50;
		
		return totalTaxes;	}

}
