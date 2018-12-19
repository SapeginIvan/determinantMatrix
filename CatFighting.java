
public class CatFighting {

    public class Cat{
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String setName, int setAge, int setWeight, int setStrength){
            name = setName;
            age = setAge;
            weight = setWeight;
            strength = setStrength;

        }

        public Cat fight(Cat Obj1, Cat Obj2){
            //Рассчитываем абсолютную силу
            //Формула
            //absStreigth = 1/age + weight + 2*strength;
            double[] absStreigth = {1/age + weight + 2*strength,
                    1/Obj1.age + Obj1.weight + 2*Obj1.strength,
                    1/Obj2.age + Obj2.weight + 2*Obj2.strength};
            int indexWinCat = 0;
            double maxStreigth = 0;
            for (int i = 0; i < 3; i++) {
                if(absStreigth[i] > maxStreigth) {
                    maxStreigth = absStreigth[i];
                    indexWinCat = i;
                }
            }
            Cat winCat = null;
            switch (indexWinCat){
                case 0: winCat =  this;
                case 1: winCat = Obj1;
                case 2: winCat = Obj2;
            }
            return winCat;
        }
    }

    public static void main(String[] args) {
        Cat littleCat = new CatFighting().new Cat("littleCat",1, 1, 1);
        Cat middleCat = new CatFighting().new Cat("middleCat",2, 2, 10);
        Cat oldCat = new CatFighting().new Cat("oldCat",10, 2, 3);
        Cat winCat = littleCat.fight(middleCat, oldCat);
        System.out.println("Winner: " + winCat.name);

    }
}