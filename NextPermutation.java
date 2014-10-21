	public static void nextPermutation(int[] num) {
		int n = num.length;
		if (n <= 1)
			return;
		int end = n - 2;
		// >= for case 11 equal number
		while (end >= 0 && num[end] >= num[end + 1])
			end--;
		// System.out.println(end);
		if (end != -1) {
			int loc = n - 1;
			// find the first larger number than num[end]
			while (num[loc] <= num[end])
				loc--;

			// System.out.println("location : "+loc);
			int t = num[loc];
			num[loc] = num[end];
			num[end] = t;
			/*
			 * for(int i=0; i<n; i++) System.out.print(num[i]+" ");
			 * System.out.println();
			 */
		}
		int start = end + 1;
		int stop = num.length - 1;
		while (start < stop) {
			int tmp = num[start];
			num[start] = num[stop];
			num[stop] = tmp;
			start++;
			stop--;
		}

		/*for (int i = 0; i < n; i++)
			System.out.print(num[i] + " ");
		System.out.println();*/
	}
