public class test1 {
	/**
	 * 随机分组	打乱数组顺序,按k组切分
	 * @param array 
	 * @param k 分组数目
	 */
	public void divide(String array[],int k){
		int r;
		for(int i = array.length-1; i >= 0; i--){//打乱顺序，时间复杂度O(n)
			r = (int) (Math.random()*i); //0~i之间的随机数
			//交换i和r
			String a = array[i];
			array[i] = array[r];
			array[r] = a;
		}
		int n = array.length/k;//分成k组,每组n人
		int m = array.length%k;//余数m人
		for (int i = 0; i < k; i++) {//直接分组
			System.out.print("第"+(i+1)+"组:");
			if(m>0){
				int index=i*(n+1);//起始位置
				for(int j=index;j<index+n+1;j++){//每组n人多1个
					System.out.print(array[j] +";");
				}
			}else{
				int index=i*n+array.length%k;//起始位置
				for(int j=index;j<index+n;j++){
					System.out.print(array[j] +";");
				}
			}
			m--;
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		test1 t = new test1();
		String array[]={"刘一","刘二","刘三","刘四","刘五","张一","张二","张三","张四","张五"};//员工信息数组
		t.divide(array, 4);
	}
	
}
