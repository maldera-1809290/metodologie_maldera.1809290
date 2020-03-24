import java.util.Arrays;

public class NumeroRomano {

		private String romano;
		
		private NumeroRomano(String n) {romano=n+" ";}
				
		private boolean confrontaGerarchia(String a, String b)
		{
			String[] gerarchia = {"I","V","X","L","C","D","M"};
			if (Arrays.asList(gerarchia).indexOf(a)>=Arrays.asList(gerarchia).indexOf(b)) return true;
			return false;
		}
		
		public void traduci()
		{
			int valore=0;			
			for (int i=0;i<romano.length()-1;i++)
			{
				if (confrontaGerarchia(romano.split("|")[i],romano.split("|")[i+1]))
				{
				switch (romano.split("|")[i])
					{
					case "I": valore+=1;break;
					case "V": valore+=5;break;
					case "X": valore+=10;break;
					case "L": valore+=50;break;
					case "C": valore+=100;break;
					case "D": valore+=500;break;
					case "M": valore+=1000;break;
					}
				}
				else
				{
					switch (romano.split("|")[i])
					{
					case "I": valore-=1;break;
					case "V": valore-=5;break;
					case "X": valore-=10;break;
					case "L": valore-=50;break;
					case "C": valore-=100;break;
					case "D": valore-=500;break;
					case "M": valore-=1000;break;
					}
				}
			}
			System.out.println(valore);
		}
		
		//M1000 D500 C100 L50 X10 V5 I1
		public static void main(String[] args) {
			NumeroRomano r = new NumeroRomano("MMXXXIV");
			r.traduci();
		}
}
