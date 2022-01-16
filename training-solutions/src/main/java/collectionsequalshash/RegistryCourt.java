package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Tuti Kft", "1234"));
        companies.add(new Company("Vesztes Kft", "5678"));
        companies.add(new Company("Normal Kft", "2345"));

        System.out.println(companies.contains(new Company("Vesztes Kft", "5678")));
    }
}
