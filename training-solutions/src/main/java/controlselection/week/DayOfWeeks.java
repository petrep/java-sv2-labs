package controlselection.week;

public class DayOfWeeks {
	public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg){
		String typeOfDay;
		switch(dayOfWeekArg.toLowerCase()){
			case "hétfő":
				typeOfDay="hét eleje";
				break;
			case "kedd":
			case "szerda":
			case "csütörtök":
				typeOfDay="hét közepe";
				break;
			case "péntek":
				typeOfDay="majdnem hétvége";
				break;
			case "szombat":
			case "vasárnap":
				typeOfDay="hét vége";
				break;
			default:
				throw new IllegalArgumentException("ismeretlen nap");
		}
		return typeOfDay;
	}
}