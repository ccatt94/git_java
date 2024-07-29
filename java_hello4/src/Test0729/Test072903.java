package Test0729;

public class Test072903 {

	public static void main(String[] args) {

        String[] sr = new String[4];

        sr[0] = new String("Java");
        sr[1] = new String("System");
        sr[2] = new String("Compiler");
        sr[3] = new String("Park");
        
        int sum = 0;
        for(int i = 0; i < sr.length; i++) {
        	sum += sr[i].length();
        }
        
        System.out.println(sum);
	}

}
