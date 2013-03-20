package net.ihe.gazelle.geoip;

/* CityLookupTest.java */

/* sample of how to use the GeoIP Java API with GeoIP City database */
/* Usage: java CityLookupTest 64.4.4.4 */

class CityLookupTest {
	public static void main(String[] args) {
		// Location l1 = LookupService.getLocation_("131.254.209.10");
		// Country c1 = cl.getCountry("131.254.209.10");
		// System.out.println(l1.toString());
		// System.out.println(c1.toString());

		// Location l1bis = clbis.getLocation("131.254.209.10");
		// Country c1bis = LookupService.getCountry_("131.254.209.10");
		// System.out.println(l1bis.toString());
		// System.out.println(c1bis.toString());

		System.out.println(LookupService.getCountry_("131.254.153.211"));
		System.out.println(LookupService.getLocation_("131.254.153.211"));

		// Location l2 = cl.getLocation(args[0]);
		// Location l2 = cl.getLocation("94.23.201.177");
		// Location l2 = cl.getLocation("88.179.64.171");
		// Location l2 = cl.getLocation("62.212.122.29");

		// System.out.println(l1.toString());
		// System.out.println(l2.toString());
		// System.out.println(l1.distance(l2));

	}
}
