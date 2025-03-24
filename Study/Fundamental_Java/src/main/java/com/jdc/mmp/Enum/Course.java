package com.jdc.mmp.Enum;

public enum Course implements FeesShowable{
	JavaSe("JAVA SE", 150000) {
		@Override
		public void showFees() {
			System.out.println(getFees());
		}
	},

	JaveEe("JAVA EE", 200000) {
		@Override
		public void showFees() {
			System.out.println(getFees());
		}
	},

	Spring("SPRING FRAMEWORK", 300000) {
		@Override
		public void showFees() {
			System.out.println(getFees());
		}
	};

	private String name;
	private int fees;

	public abstract void showFees();
	
	public int getFees() {
		return fees;
	}
	
	private Course(String name, int fees) {
		this.name = name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void showFeesWithFormat() {
		System.out.printf("%s : %d MMK%n", name, fees);
		
	}
	
}
