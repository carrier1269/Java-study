package motherson;

class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm super class");
	}
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}

class SuperSubCon{
	public static void main(String[] args) {
		new SubCLS();
	}
}