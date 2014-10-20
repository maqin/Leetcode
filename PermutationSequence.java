public static String getPermutation(int n, int k) {
		StringBuilder res = new StringBuilder();
		int[] num = new int[n + 1];
		for (int i = 1; i <= n; i++)
			num[i] = i;

		int sum = 1;
		for (int i = 1; i < n; i++)
			sum *= i;
		int b = n - 1;
		while (true) {
			int t1 = (int) Math.ceil(1.0 * k / sum);
			int t2 = k - sum * (t1 - 1);
			// System.out.println(t1+" "+t2);
			int p = 1;
			int t = 0;
			while (true) {
				// System.out.println("need to find the nth : "+t1);
				if (num[p] > 0) {
					t++;
				}
				if (t == t1)
					break;
				p++;
			}
			// System.out.println("The p I have found : "+p);
			res.append(num[p]);
			num[p] = 0;
			if (b == 0)
				break;
			sum /= b;
			k = t2;
			b--;
		}
		return res.toString();
	}
