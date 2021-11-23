package algorithmscount.height;

import java.util.List;

public class Height {
	public int countChildrenWithHeightGreaterThan(List<Integer> heights, int minimumHeight) {
		int allowedChildrenCount = 0;

		for (int height : heights) {
			if (height > minimumHeight) allowedChildrenCount++;
		}

		return allowedChildrenCount;
	}
}
