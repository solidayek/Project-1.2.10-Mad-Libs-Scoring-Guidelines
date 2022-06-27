import java.util.Scanner;
class fillingIn {
  public static void main(String[] args) {

    //attributes
    String firstSetenceInput;
    String adj;
    String nationality;
    String nameOfPerson;

    String noun;
    String adj2;
    String noun2;


    //constructor -- you can have multiple constructors, just as long as you have different parameters

    public fillingIn(String firstAdj, String personNationality, String personName){
      adj = firstAdj;
      nationality = personNationality;
      nameOfPerson = personName;

    }

    public fillingIn(String firstNoun, String secondAdj, String secondNoun){
      noun = firstNoun;
      adj2 = secondAdj;
      noun2 = secondNoun;
    }

  
    
  }
}