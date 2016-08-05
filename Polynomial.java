class Polynomial {

	ArrayList<Double> coefficients;
	
	public static ArrayList<Double> initZero(ArrayList<Double> a, int size) {
        
        for(int i = 0; i < size; ++i) {
            
            a.add(0.0);
            
        }
        
        return a;
        
    }
	
	public static ArrayList<Double> Add(ArrayList<Double> B)
	{
		int size = coefficients.size()>B.size()? coefficients.size(): B.size();
		ArrayList<Double> C=new ArrayList<Double>();
		initZero(C, size);
		for(int i=0;i<size;i++)
		{
			double coeff=coefficients.get(i)+B.get(i);
		    System.out.println("COEFF"+coeff);
			C.set(i,coeff);
		}
		return (C);
		
	}
	public static ArrayList<Double> Subtract(ArrayList<Double> B)
	{
		int size = coefficients.size()>B.size? coefficients.size(): B.size(),i;
		ArrayList<Double> C=new ArrayList<Double>(size);
		initZero(C, size);
		for(i=0;i<size;i++)
		{
			int coeff=coefficients.get(i)-B.get(i);
			C.set(i,coeff);
		}
		return (C);
		
	}
	
    
    public static ArrayList<Double> multiply(ArrayList<Double> b) {
        
        ArrayList<Double> product = new ArrayList<Double>();
        
        int productSize = b.size()+coefficients.size();
        
        initZero(product, productSize);
        
        
        for(int i = 0; i < coefficients.size(); ++i) {
            
            for(int j = 0; j < b.size(); ++j) {
            
                Double newCoeff = coefficients.get(i) * b.get(j);
                int newPower = i + j;
                
                newCoeff += product.get(newPower);
                
                
                product.set(newPower, newCoeff);
                
                
            }
            
        }
        
        
        return product;
        
    }
	
}
