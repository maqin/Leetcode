public static int maxProfit(int[] prices) {
		if (prices.length <= 1)
			return 0;
		int n = prices.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int minLeft = prices[0];
		int maxRight = prices[n-1];
		for (int i = 1; i < n; i++) {
			left[i] = (prices[i] - minLeft) > left[i-1] ? prices[i] - minLeft : left[i-1];
			if (prices[i] < minLeft)
				minLeft = prices[i];
		}
		/*for(int i = 0; i<n; i++)
			System.out.print(left[i]+" ");
		System.out.println();*/
		for (int i = n - 2; i >= 0; i--) {
			right[i] = (maxRight-prices[i+1]) > right[i+1] ? maxRight-prices[i+1] : right[i+1];
			if (prices[i] > maxRight)
				maxRight = prices[i];
		}
		/*for(int i = 0; i<n; i++)
			System.out.print(right[i]+" ");
		System.out.println();*/
		int res = 0;
		for (int i = 0; i < prices.length; i++)
			if (left[i] + right[i] > res)
				res = left[i] + right[i];

		return res;
	}
