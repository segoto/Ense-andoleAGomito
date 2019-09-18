import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CodeForces1211A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		ArrayList<Integer> complejidades = new ArrayList<>();
		for(int i = 0 ; i < a; ++i){
			complejidades.add(Integer.parseInt(str[i]));
		}
		int p = -1;
		int minimo = 1000000001;
		for(int i = 0; i < a ; ++i){
			if(minimo > complejidades.get(i)){
				p = i+1;
				minimo = complejidades.get(i);
			}
		}
		int s = -1;
		int segundo = 1000000001;
		for(int i = 0 ; i < a; ++i){
			if(minimo < complejidades.get(i) && segundo > complejidades.get(i)){
				segundo = complejidades.get(i);
				s = i+1;
			}
		}
		int t = -1;
		int tercero = 1000000001;
		for(int i = 0 ; i < a; ++i){
			if(segundo < complejidades.get(i) && tercero > complejidades.get(i)){
				tercero = complejidades.get(i);
				t = i+1;
			}
		}
		if( s == -1 || t == -1)
			System.out.println("-1 -1 -1");
		else
			System.out.println(p+" "+s+" "+t);
	}
}
