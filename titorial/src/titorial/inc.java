package titorial;

public class inc {
	public static void main(String[] args) {
		String[][] m = {{"���","-��","-��"},{"���","-��","-��"},{"���","��-��-��","���-��-��"}};
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				System.out.print(m[row][col]+"");
				try{
					Thread.sleep(500);
				}catch(Exception e){}
			}
			System.out.println();
		}
	}

}
