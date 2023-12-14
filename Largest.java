//regular class
public class Largest {
	public Largest() {
	}
		public int largest(int[] list){
			int index;
			int max = list[0]; //used to be max = 0 but we fixed it.
			for (index = 0; index < list.length; index++){ //changed list.length - 1 to just list.length.
				if (list[index] > max) {
					max = list[index];
				}
			}
			return max;
		}
	

}
