package com.example.example.interfac;

public class abc {
	
	public static void main(String[] args) {
		String[] arr = new String[] {"2","this is junk text", "123:224:234:445:123:224:234:445"};
		abc.checkIPs(arr);
		for(String str : abc.checkIPs(arr)) {
			System.out.println(str);
		}
	}
	 static String[] checkIPs(String[] ip_array) {
	      //  int count = Integer.parseInt(ip_array[0]);
	        
	        int count = ip_array.length;
	        String[] result = new String[count-1];
	        if(count <= 0) {
	            result[0] = "neigther";
	        } else {
	            for(int i = 1; i<count; i++) {
	                String ip = ip_array[i];
	              //  System.out.print(ip);
	                if(ip.contains(":")) {
	                    String[] split = ip.split(":");
	                    if(split.length == 8){
	                        result[i-1] = "IPv6";
	                    }
	                } else if(ip.contains(".")){
	                     String[] split = ip.split("\\.");
	                    if(split.length == 4){
	                        result[i-1] = "IPv4";
	                    }
	                } else{
	                     result[i-1] = "neigther";
	                }
	            }
	        }
	        
	return result;
	    }
}
