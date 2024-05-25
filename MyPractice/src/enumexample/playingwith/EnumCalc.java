package enumexample.playingwith;

public enum EnumCalc implements ParentEnum {
	XTRA {

		@Override
		public double multiply(int x, int y) {
			// TODO Auto-generated method stub
			return x * y * 10;
		}

		@Override
		public double divide(int x, int y) {
			// TODO Auto-generated method stub
			return x / y * 100;
		}

	},
	NORMAL {
		@Override
		public double multiply(int x, int y) {
			// TODO Auto-generated method stub
			return x * y;
		}
		@Override
		public double divide(int x, int y) {
			// TODO Auto-generated method stub
			return x / y;
		}
		
	}, 
	THIRD{

		@Override
		public double multiply(int x, int y) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double divide(int x, int y) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	};

	EnumCalc() {
		// TODO Auto-generated constructor stub
		System.out.println("Enum Constructor");
	}
	void XTRA()
	{
		System.out.println("XTRA Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println(EnumCalc.XTRA.multiply(4, 5));
		
		
	
		
	}
	

}
