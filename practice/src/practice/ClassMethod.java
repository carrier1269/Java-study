package practice;

class ClassMethod {

	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);
		np.setMyNumber(75);
		np.showMyNumber();
	}

}
