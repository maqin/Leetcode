public static int jump(int[] A){
		int n = A.length;
		if(n<=1)
			return 0;
		int step = 0;	
		int start = 0;
		
		while(true){
			int index = 0;
			int longestDistance = -1;
			step++;
			//System.out.println(start+" "+ A[start]);
			if(A[start]+start+1>=n)
				return step;
			for(int i = 1; i<= A[start]; i++){
				int distance = start+i+A[start+i];
				if(distance > longestDistance){
					index = start+i;
					longestDistance = distance;
				}
			}
			start = index;
			if(A[start]==0)
			    break;
		}
		return -1;
	}
