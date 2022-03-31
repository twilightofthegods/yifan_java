public class Hello {
	public static void main(String[] args) {
		Income[] fees = { new Salary(7500), new Gaofei(2000) };
		System.out.println(totalTax(fees));
	}

	public static double totalTax(Income... fees) {
		double tax = 0;
		for (Income tmp : fees) {
			tax += tmp.getTax();
		}
		return tax;
	}
}

abstract class Income {
	protected double income;

	public Income(double income) {
		this.income = income;
	};

	public abstract double getTax();
}

class Salary extends Income {
	public Salary(double income) {
		super(income);
	}

	@Override
	public double getTax() {
		if (income <= 5000) {
			return 0;
		} else
			return (income - 5000) * 0.1;
	}
}

class Gaofei extends Income {
	public Gaofei(double income) {
		super(income);
	}

	@Override
	public double getTax() {
		return income * 0.2;
	}
}
