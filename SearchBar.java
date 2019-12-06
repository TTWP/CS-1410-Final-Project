package application;

import java.util.Arrays;

/**
 * 
 * 
 * 
 * @author Yingjie He
 * 
 *         This is SearBar class, to realize search.
 * 
 * 
 * 
 *
 */
public class SearchBar {
	// Create a array to store the ELC level 3 classroom number.
	private static String[] elcRoomL3 = { "301", "305", "306", "308", "308A", "308a", "309", "310", "311", "312",
			"313" };

	// To decide open which level window or elc window.
	public void isElcclassroom(String value) {
		System.out.println(value);
		if (value.length() > 3) {
			value = value.substring(3, value.length());
			String levelAlp = value.replaceAll("[^\\d]", "");
			int level = Integer.valueOf(levelAlp);

			if (Arrays.asList(elcRoomL3).contains(value)) {
				ElcBuildingLevel3Room BuildingLevel3Room = new ElcBuildingLevel3Room(value);
			} else if (level < 200 && level > 0) {
				ElcBuildingLevel1 elcBuildingLevel1 = new ElcBuildingLevel1();
			} else if (level < 300 && level >= 200) {
				ElcBuildingLevel2 elcBuildingLevel2 = new ElcBuildingLevel2();
			} else if (level < 500 && level >= 400) {
				ElcBuildingLevel4 elcBuildingLevel4 = new ElcBuildingLevel4();
			}
		} else {
			ElcBuilding elc = new ElcBuilding();
		}
	}

	// To open ST window
	public void isStBuilding() {
		StudentCenter st = new StudentCenter();
	}

	// To open GC window
	public void isGcBuilding() {
		GeneralClassroomsBuilding gc = new GeneralClassroomsBuilding();
	}

	// To open PE window
	public void isPeBuilding() {
		PEbuilding pe = new PEbuilding();
	}

	// To open LiB window
	public void isLibBuilding() {
		Library lib = new Library();
	}

	// To open Theater window
	public void isTtBuilding() {
		Theater tt = new Theater();
	}
}
