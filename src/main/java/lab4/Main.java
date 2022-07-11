package lab4;
//Smovzhenko Anton

public class Main {

    public static void main(String[] args) {


        final DaoProduct daoProduct = new DaoProduct("file.db");
        for(int i = 0; i < 50; i++){
            daoProduct.insertProduct(new Product(" simple-dimple "+i , Math.ceil(Math.random()*1000),Math.ceil(Math.random()*1000)," for kids (but not only)", " Ukr enterprise"));
        }

        daoProduct.getAll(0,50)
                .forEach(System.out::println);

    }
}