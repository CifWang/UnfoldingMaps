package test;

public class Airport {
	private String city;
	private String country;
	private String code3;
	
	public String getCity() {return this.city;}
	public String getCountry() {return this.country;}
	public String getCode() {return this.code3;}
	
	public static String findAirportCode(String toFind, Airport[] airports) {
		for(int i=0;i<airports.length;i++) {
			if(airports[i].getCity().equals(toFind)) {
				return airports[i].getCode();
			}
		}
		return null;//这个一开始没有，报错，因为如果找不到，就不会返回，所以在返回值那里报错
	}

}
