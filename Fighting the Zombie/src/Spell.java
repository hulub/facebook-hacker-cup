
public class Spell {
	public final int times, faces, subtract;
	
	public Spell(String s) {
		String[] s_split = s.split("d");
		times = Integer.parseInt(s_split[0]);
		String[] s_split_split = s_split[1].split("+");
		faces = Integer.parseInt(s_split_split[0]);
		if (s_split_split.length==1)
			subtract=0;
		else
			subtract = Integer.parseInt(s_split_split[1]);
	}
}
