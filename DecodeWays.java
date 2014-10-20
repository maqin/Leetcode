public static int numDecodings(String s) {
	if (s.length() == 0 || (s.length() > 0 && s.charAt(0) == '0'))
		return 0;

	int n = s.length();
	int[] dp = new int[n + 1];
	dp[0] = 1;
	dp[1] = 1;

	for (int i = 1; i < s.length(); i++) {
		if (s.charAt(i) == '0') {
			if (s.charAt(i - 1) != '1' && s.charAt(i - 1) != '2')
				return 0;
			else
				dp[i + 1] = dp[i - 1];
		} else {
			int v = Integer.valueOf(s.substring(i - 1, i + 1));
			if ((v >= 1 && v <= 26) && s.charAt(i - 1) != '0')
				dp[i + 1] = dp[i] + dp[i - 1];
			else
				dp[i + 1] = dp[i];
		}
	}
	return dp[n];
}
