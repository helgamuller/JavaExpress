package practice6.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//list of strings with names and gender
//example "John:M"
//need to group it into map by gender Map<String, List<String>>
//                                             gender,names
 class GroupByGender {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John:M", "Sarah:F", "Olga:F ");

        Map<String, List<String>> groupedByGender=names.stream()
                .collect(Collectors.groupingBy(name->{
                            System.out.println(" key before " + name);
                            System.out.println(" key after " + name.split(":")[1]);

                            return   name.split(":")[1];},
                        Collectors.mapping(name-> {
                                    System.out.println("value before " + name);
                                    System.out.println("value after " + name.split(":")[0]);

                                    return name.split(":")[0];
                                }
                        , Collectors.toList())));
        System.out.println(groupedByGender);
    }
}
