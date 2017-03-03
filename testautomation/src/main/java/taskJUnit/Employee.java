package taskJUnit;

public class Employee {

	public double calculateSalary(double baseRate, double exprianceRatio, double bonus) {
		return baseRate * exprianceRatio + bonus;
	}

	public double calculateFinancialAid(double baseRate, double percentOfBaseRate) {

		return baseRate * percentOfBaseRate;
	}

	public double calculateDetailsPerHour(int details, double hours) {

		return hours / details;
	}

	public double calculateTaxesOnNaturalPerson(double baseRate, double exprianceRatio, double bonus,
			double taxOnNaturalPersonPercent, double militaryTaxPercent) {

		return (baseRate * exprianceRatio + bonus) * (taxOnNaturalPersonPercent + militaryTaxPercent) / 100;
	}

	public double calculatePaymentsToTheTradeUnion(double baseRate, double exprianceRatio, double bonus,
			double percentToTheTradeUnion) {
		return (baseRate * exprianceRatio + bonus) * percentToTheTradeUnion / 100;
	}

	public double calculateBonus(int details, double bonusForDetail) {
		return details * bonusForDetail;

	}

	/* public double calculateExperianceOnThePosition(String d1, String d2) {
	 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
	 Date date1 = null;
	 Date date2 = null;
	 try {
	 date1 = format.parse(d1);
	 date2 = format.parse(d2);
	 } catch (Exception e) {
	 e.printStackTrace();
	 }
	 long difference = date1.getTime() - date2.getTime();
	 return difference / (24 * 60 * 60 * 1000);
	 } */

}
