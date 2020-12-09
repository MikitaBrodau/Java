package aggregation;

import java.util.ArrayList;
import java.util.List;

/* Task 3. Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/
public class Goverment implements populationAndSquare<Region> {
    private List<Region> regionsList;
    private String name;
    private long population;
    private double territory;

    public Goverment(String name, List<Region> regions) {
        this.name = name;
        this.regionsList = regions;
        population(regions);
        hectare(regions);
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public double getTerritory() {
        return territory;
    }

    public List<City> capital() {
        List<City> capitals = new ArrayList<>();
        for (Region r :
                regionsList) {
            for (District d : r.districtsList) {
                for (City c : d.cityList) {
                    if (c.isCapital()){
                        capitals.add(c);
                    }
                }
            }
        }
        return capitals;
    }

    public List<City> regionCenter() {
        List<City> regionCenters = new ArrayList<>();
        for (Region r : regionsList) {
            for (District d : r.districtsList) {
                for (City c : d.cityList) {
                    if (c.isRegionCenter()){
                        regionCenters.add(c);
                    }
                }
            }
        }
        return regionCenters;
    }

    @Override
    public void population(List<Region> districts) {
        for (Region r : districts) {
            this.population += r.getPopulation();
        }
    }

    @Override
    public void hectare(List<Region> districts) {
        for (Region r : districts) {
            this.territory += r.getHectare();
        }
    }

    @Override
    public String toString() {
        return "\tdistrictList: " + regionsList.toString() +
                "\tname: " + name +
                "\tpopulation: " + population +
                "\tterritory: " + territory;
    }
}
class Region implements populationAndSquare<District> {
    private String regionName;
    public List<District> districtsList;
    private long population;
    private double hectare;

    public Region(String regionName, List<District> citylist) {
        this.regionName = regionName;
        this.districtsList = citylist;
        population(citylist);
        hectare(citylist);
        for (District c : citylist) {
            c.setRegion(regionName);
        }
    }

    public long getPopulation() {
        return population;
    }

    public double getHectare() {
        return hectare;
    }

    @Override
    public void population(List<District> list) {
        for (District c : list) {
            this.population += c.getPopulation();
        }
    }

    @Override
    public void hectare(List<District> list) {
        for (District c : list) {
            this.hectare += c.getHectare();
        }
    }

    @Override
    public String toString() {
        return "regionName: " + regionName +
                "\ndistrictList: " + districtsList +
                "\npopulation: " + population +
                "\nhectare: " + hectare;
    }
}

class District implements populationAndSquare<City> {
    private String districtName;
    public List<City> cityList;
    private String region;
    private long population;
    private double hectare;

    public District(String districtName, List<City> citylist) {
        this.districtName = districtName;
        this.cityList = citylist;
        population(citylist);
        hectare(citylist);
        for (City c : citylist) {
            c.setDistrict(districtName);
        }
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPopulation() {
        return population;
    }

    public double getHectare() {
        return hectare;
    }

    @Override
    public void population(List<City> list) {
        for (City c : list) {
            this.population += c.getPopulation();
        }
    }

    @Override
    public void hectare(List<City> list) {
        for (City c : list) {
            this.hectare += c.getHectare();
        }
    }

    @Override
    public String toString() {
        return "regionName: " + districtName +
                "\ncityList: " + cityList +
                "\npopulation: " + population +
                "\nhectare: " + hectare;
    }
}

class City {
    private String cityName;
    private long population;
    private double hectare;
    private String region;
    private String district;
    private boolean capital;
    private boolean regionCenter;

    public City(String cityName, int population, double hectare, boolean capital, boolean regionCenter) {
        this.cityName = cityName;
        this.population = population;
        this.hectare = hectare;
        this.capital = capital;
        this.regionCenter = regionCenter;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public long getPopulation() {
        return population;
    }

    public double getHectare() {
        return hectare;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isCapital() {
        return capital;
    }

    public boolean isRegionCenter() {
        return regionCenter;
    }

    @Override
    public String toString() {
        return "\nCity: " + cityName + "\t\tpopulation: " + population + "\t\thectare: " + hectare + "\t\tregion: " + region;
    }
}