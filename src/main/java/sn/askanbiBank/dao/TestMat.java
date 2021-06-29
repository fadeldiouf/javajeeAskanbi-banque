package sn.askanbiBank.dao;

public class TestMat {
	public static String getMatricule(int n) 
    {
        //choisissez un caractére au hasard à partir de cette chaîne
        String str = "0123456789"; 
  
        StringBuilder s = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            int index = (int)(str.length() * Math.random()); 
            s.append(str.charAt(index)); 
        } 
        return s.toString(); 
    } 

	public static void main(String[] args) {
		int len = 10; 
        System.out.println(getMatricule(len)); 
		// TODO Auto-generated method stub

	}

}
