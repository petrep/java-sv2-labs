package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("anyBuilding", 212.4, 6);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding("schoolbuilding", 1554.8, 4, 21);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
