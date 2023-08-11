public class CountryDivisble {
    public static void main(String[] args) {
        int yearOfCountry = 2016;
        int ageOfCitizens = 19 ;

        if (((yearOfCountry % 4)== 0) && (ageOfCitizens >= 18) ){
            System.out.println(" Allowes !! it is an election year! ");
        } else {
            System.out.println(" Not allowes  ");

        }
    }
}
