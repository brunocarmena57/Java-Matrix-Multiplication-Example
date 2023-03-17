import java.util.Scanner;



public class Exercicio1 {
	public static void main(String args[]){

		//variáveis
		int n, m, k;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira tres valores: ");
        n = leitor.nextInt();
        m = leitor.nextInt();
        k = leitor.nextInt();

		int[][] mat = new int[n][m];
		int[][] mat2 = new int[m][k];  
		int[][] mat3 = new int[n][k];        
        
		System.out.println("Insira os valores da primeira matriz [" + n + " x " + m + "]");
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                mat[i][j] = leitor.nextInt();
            }   
        }
        System.out.println("Insira os valores da segunda matriz [" + m + " x " + k + "]");
        for(int i=0; i < m; i++){
                for(int j=0; j < k; j++){
                    mat2[i][j] = leitor.nextInt();
            }                   
        }     

        for(int i=0; i < m; i++){
            for(int j=0; j < m; j++){
                mat3[i][j] = (mat[i][j] * mat2[j][i]);
            }                   
            System.out.println();
        }  
        System.out.println();
        for(int i=0; i < m; i++){
            for(int j=0; j < k; j++){
                System.out.print(mat2[i][j] + " ");
            }                   
            System.out.println();
        }  
    }
}

