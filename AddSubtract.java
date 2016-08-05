
class Polnomial {

	public static ArrayList<Double> Add(ArrayList<Double> B)
	{
		int size = A.size()>B.size? A.size(): B.size(),i;
		ArrayList<Double> C=new ArrayList<Double>(size);
		initZero(C, size);
		for(i=0;i<size;i++)
		{
			int coeff=A.get(i)+B.get(i);
			C.set(i,coeff);
		}
		return (C);
		
	}
	public static ArrayList<Double> Subtract(ArrayList<Double> B)
	{
		int size = A.size()>B.size? A.size(): B.size(),i;
		ArrayList<Double> C=new ArrayList<Double>(size);
		initZero(C, size);
		for(i=0;i<size;i++)
		{
			int coeff=A.get(i)-B.get(i);
			C.set(i,coeff);
		}
		return (C);
		
	}
}
