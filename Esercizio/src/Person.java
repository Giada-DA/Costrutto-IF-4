public class Person {
    public int age;
    int min = 5;
    int max = 80;
    public Person(){
        age = (int) Math.floor(Math.random()*(max-min+1)+min);
    }
    public String getLifeStage(){
        if(age<=12){
            return "a child!";
        } else if (age>=13 && age<=19) {
            return "a teen!";
        }else if (age>=20 && age<=59){
            return "an adult!";
        } else return"a senior adult!";
    }
}
