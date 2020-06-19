package task4;

public class MinMax {
	static class MaxOrMin {
		static int min (int values[]) {
			int min = values[0];
			for (int i= 0; i< values.length; i++) {
		        if (values[i] < min) {
		            min = values[i];
		        }
		    }
		    return min;
		}
		
		static int max (int values[]) {
			int max = values[0];
			for (int i= 0; i< values.length; i++) {
		        if (values[i] > max) {
		            max = values[i];
		        }
		    }
		    return max;
		}
	}
		static String minmax(int values[]) {
			MaxOrMin k = new MaxOrMin();
			return "min: " + k.min(values) + " max: " + k.max(values);
		}
	}
