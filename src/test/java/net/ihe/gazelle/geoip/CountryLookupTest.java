package net.ihe.gazelle.geoip;

/* CountryLookupTest.java */

/* Only works with GeoIP Country Edition */
/* For Geoip City Edition, use CityLookupTest.java */

class CountryLookupTest {
	public static void main(String[] args) {
		// You should only call GeoIP once, especially if you use
		// GEOIP_MEMORY_CACHE mode, since the GeoIP constructor takes up
		// resources to load the GeoIP.dat file into memory
		// GeoIP cl = new GeoIP(dbfile,GeoIP.GEOIP_STANDARD);

		System.out.println(GeoIP.getCountry_("151.38.39.114").getCode());
		System.out.println(GeoIP.getCountry_("151.38.39.114").getName());
		System.out.println(GeoIP.getCountry_("12.25.205.51").getName());
		System.out.println(GeoIP.getCountry_("64.81.104.131").getName());
		System.out.println(GeoIP.getCountry_("200.21.225.82").getName());

		System.out.println(GeoIP.getCountry_("200.21.225.82").getName());
		System.out.println(GeoIP.getCountry_("200.21.225.82").getName());
		System.out.println(GeoIP.getCountry_("200.21.225.82").getName());
	}
}
