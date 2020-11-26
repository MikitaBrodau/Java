package aggregation;

import java.util.ArrayList;
import java.util.List;

/* Task 3. Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/
public class Goverment implements populationAndSquare {
    private RegionList regionList;
    private String name;
    private long population;
    private double territory;

    public Goverment(String name, RegionList regions) {
        this.name = name;
        this.regionList = regions;
        population(regions.regions);
        hectare(regions.regions);
    }
    public void regionCenters(){
        for (Region r : regionList.regions) {
            for (City c : r.cityList) {
                if(c.isRegionCenter()) System.out.println(c.toString());
            }
        }
    }
    public void capital(){
        for (Region r : regionList.regions) {
            for (City c : r.cityList) {
                if(c.isCapital()) System.out.println(c.toString());
            }
        }
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

    public void setRegionList(Region region) {
        this.regionList.regions.add(region);
    }

    public int getAmountOfRegions() {
        return regionList.regions.size();
    }

    @Override
    public void population(List<?> obj) {
        for (Region r : (List<Region>) obj) {
            this.population += r.getPopulation();
        }
    }

    @Override
    public void hectare(List<?> obj) {
        for (Region r : (List<Region>) obj) {
            this.territory += r.getHectare();
        }
    }

    @Override
    public String toString() {
        return "\tregionList: " + regionList.regions.toString() +
                "\tname: " + name +
                "\tpopulation: " + population +
                "\tterritory: " + territory;
    }
}

class Region implements populationAndSquare {
    private String regionName;
    public List<City> cityList;
    private long population;
    private double hectare;

    public Region(String regionName,List<City> citylist) {
        this.regionName = regionName;
        this.cityList = citylist;
        population(citylist);
        hectare(citylist);
        for (City c : citylist) {
            c.setRegion(regionName);
        }
    }

    public long getPopulation() {
        return population;
    }

    public double getHectare() {
        return hectare;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setHectare(double hectare) {
        this.hectare = hectare;
    }

    @Override
    public void population(List<?> list) {
        for (City c : (List<City>) list) {
            this.population += c.getPopulation();
        }
    }

    @Override
    public void hectare(List<?> list) {
        for (City c : (List<City>) list) {
            this.hectare += c.getHectare();
        }
    }

    @Override
    public String toString() {
        return "regionName: " + regionName +
                "\ncityList: " + cityList +
                "\npopulation: " + population +
                "\nhectare: " + hectare;
    }
}
class RegionList{
    public List<Region> regions = new ArrayList<>();
    private Region region;

    public RegionList(Region region) {
        this.region = region;
        this.regions.add(region);
    }
}

class City {
    private String cityName;
    private long population;
    private double hectare;
    private String region;
    private boolean capital;
    private boolean regionCenter;

    public City(String cityName, int population, double hectare, boolean capital, boolean regionCenter) {
        this.cityName = cityName;
        this.population = population;
        this.hectare = hectare;
        this.capital = capital;
        this.regionCenter = regionCenter;
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

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setHectare(double hectare) {
        this.hectare = hectare;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public void setRegionCenter(boolean regionCenter) {
        this.regionCenter = regionCenter;
    }

    @Override
    public String toString() {
        return "\nCity: " + cityName + "\t\tpopulation: " + population + "\t\thectare: " + hectare + "\t\tregion: " + region;
    }
}
class CityList{
    public List<City> cities = new ArrayList<>();
    private City city;

    public CityList(City city) {
        this.city = city;
        this.cities.add(city);
    }
    public void capital(){
        for (City c :cities) {
            if (c.isCapital())
                System.out.println(c.toString());
        }
    }
    public void regionCenter(){
        for (City c :cities) {
            if (c.isRegionCenter())
                System.out.println(c.toString());
        }
    }
    @Override
    public String toString() {
        return city.toString();
    }
}