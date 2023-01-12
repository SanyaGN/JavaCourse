import service.CatService;

public class Main {
    public static void main(String[] args) {
        CatService catService = new CatService();

        // cat with max age
        catService.catWithMaxAge();

        //cat with min age
        catService.catWithMinAge();

        //cat with min weight
        catService.catWithMinWeight();

        //cat with max weight
        catService.catWithMaxWeight();

        //pet with min age
        catService.petWithMinAge();
    }
}