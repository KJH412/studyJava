package javaedu;
/*
 * 2차원 배열에 학년별로 1,2학기 성적을 저장하고, 4년 전체 평점 평균을 출력
 * {3.3, 3.4},
 * {3.5, 3.5},
 * {3.7, 4.0},
 * {4.1, 4.2}
 * */
public class 배열2차원 {

	public static void main(String[] args) {
		double score[][]= {
				               {3.3, 3.4}, //0
				               {3.5, 3.5}, //1
				               {3.7, 4.0}, //2
				               {4.1, 4.2}  //3
		                  };
		double sum = 0;
		for(int year=0; year<score.length; year++) { //학년,score.length=4(row개수)
			for(int term=0; term<score[year].length; term++) //학기, score[year].length
				sum += score[year][term]; //전체 평점의 합
		}
	
	        int n = score.length; //row=4
			int m = score[0].length; //index 0인 row의 원소 갯수 =2
		System.out.println("4년 전체 평점의 평균 : " + sum/(n*m));

	}

}
