package test;

import java.util.*;

public class Airport implements Comparable<Airport>{
	private String city;
	private String country;
	private String code3;
	
	public String getCity() {return this.city;}
	public String getCountry() {return this.country;}
	public String getCode() {return this.code3;}
	
	public void setCity(String city) {this.city=city;}
	public void setCountry(String country) {this.country=country;}
	public void setCode(String code3) {this.code3=code3;}
	
	
	
	/**
	public static String findAirportCode(String toFind, Airport[] airports) {
		for(int i=0;i<airports.length;i++) {
			if(airports[i].getCity().equals(toFind)) {
				return airports[i].getCode();
			}
		}
		return null;//这个一开始没有，报错，因为如果找不到，就不会返回，所以在返回值那里报错
	}*/
	
	public int compareTo(Airport other) {
		return(this.getCountry().compareTo(other.getCountry()));
	}
	
	public static void main(String[] args) {
		ArrayList<Airport> airports=new ArrayList();
		Airport B=new Airport();
		B.setCity("Beijing");B.setCountry("China");B.setCode("123");
		airports.add(B);
		Airport U=new Airport();
		U.setCity("LA");U.setCountry("America");U.setCode("456");
		airports.add(U);
		Collections.sort(airports);
		//List<Integer> test= new ArrayList();
		//test.add(3);test.add(1);test.add(2);
		//Collections.sort(test);
		//for (int item :test) {
		//	System.out.println(item);
		//}
	}

}


