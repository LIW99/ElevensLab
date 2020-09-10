
    public static String arePermutations((List<Integer> arr1, List<Integer> arr2) {
        boolean iInJ;
    	for (int i = 0; i < arr1.size(); i++)
    	{
    		iInJ = false;
    		for (int j = 0; j < arr2.size(), j++)
    		{
    			if (arr1.get(i) == arr2.get(j))
    				iInJ = true;
    		}
    		if (!(iInJ))
    			return false;
    	}
    	return true;
     }