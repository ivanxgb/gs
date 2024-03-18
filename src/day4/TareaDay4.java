package day4;

public class TareaDay4 {
    public int sumArray(int[] numArray) {
        int suma = 0;
        for (int i = 0; i < numArray.length; i++){
            suma = suma + numArray[i];

        }
        System.out.println(suma);

        return suma;
    }


    public int findCity(String[] cities, String cityToFind) {
        for (int i = 0 ; i < cities.length; i++) {
            if (cities[i].trim().equalsIgnoreCase(cityToFind.trim())){
                return i;
            }
        }

        return -1;
    }
}


